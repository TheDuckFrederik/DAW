# Pràctica 2: Configuració de xarxes — Resolució

## [4 punts] 1) Anàlisi de l’esquema de xarxa de la PIME

### 1.1 Extensió geogràfica
És una **LAN (Local Area Network)**, ja que connecta equips dins d’un entorn d’oficina/empresa en un espai físic reduït (mateix edifici o recinte), amb sortida a Internet mitjançant router/firewall.

---

### 1.2 Topologia física i elements de la xarxa
La topologia física és una **estrella jeràrquica** (core/distribució/accés), habitual en PIME.

**Elements identificables a l’esquema:**
- **Router** (sortida WAN/Internet)
- **Firewall** (filtrat i seguretat)
- **Switch backbone/core**
- **Switch principal d’accés**
- **Servidors interns** (fitxers, aplicacions, etc.)
- **PCs i portàtils** (enginyeria, administració, etc.)
- Possibles **AP Wi-Fi** i perifèrics de xarxa

Flux típic:  
`Internet ⇄ Router ⇄ Firewall ⇄ Switch backbone ⇄ Switch accés ⇄ Hosts/Servidors`

---

### 1.3 Topologia lògica + pla d’adreçament IP (basat en 10.0.0.0)
Per ordenar tràfic i seguretat, es proposa segmentació per VLAN/subxarxa:

- **VLAN 10 – Enginyeria:** `10.0.10.0/24`
- **VLAN 20 – Administració:** `10.0.20.0/24`
- **VLAN 30 – Servidors:** `10.0.30.0/24`
- **VLAN 99 – Gestió:** `10.0.99.0/24`

**Passarel·la (gateway) per VLAN**:
- VLAN10 → `10.0.10.1`
- VLAN20 → `10.0.20.1`
- VLAN30 → `10.0.30.1`
- VLAN99 → `10.0.99.1`

**DNS recomanat**:
- DNS intern: `10.0.30.10`
- DNS extern secundari: `8.8.8.8` (o `1.1.1.1`)

**Exemple d’assignació d’hosts**
- `PC_Enginyer_1` → IP `10.0.10.15`, màscara `255.255.255.0`, GW `10.0.10.1`, DNS `10.0.30.10`
- `Portàtil_Admin` → IP `10.0.20.20`, màscara `255.255.255.0`, GW `10.0.20.1`, DNS `10.0.30.10`
- `Servidor_Intern` → IP `10.0.30.20`, màscara `255.255.255.0`, GW `10.0.30.1`

---

### (EXTRA) Packet Tracer (què has de mostrar)
- Muntatge de dispositius i cablejat
- VLANs i ports assignats
- IP estàtica als hosts
- Ping entre hosts mateixa VLAN
- Ping inter-VLAN (si hi ha routing)
- Ping a IP externa (si configures NAT/sortida)

---

## [4 punts] 2) Tutorial d’IP estàtica a Windows 11 i Ubuntu 24.04

## 2.1 Windows 11 — mode gràfic
1. **Configuració** → **Xarxa i Internet** → **Ethernet**
2. **Assignació IP** → **Edita** → **Manual**
3. Activa **IPv4**
4. Introdueix:
   - IP: `10.0.10.15`
   - Màscara: `255.255.255.0`
   - Porta d’enllaç: `10.0.10.1`
   - DNS: `10.0.30.10`, `8.8.8.8`

## 2.2 Windows 11 — línia d’ordres (CMD)
```bat
netsh interface ip set address name="Ethernet" static 10.0.10.15 255.255.255.0 10.0.10.1
netsh interface ip set dns name="Ethernet" static 10.0.30.10
netsh interface ip add dns name="Ethernet" 8.8.8.8 index=2
ipconfig /all
```

---

## 2.3 Ubuntu 24.04 — mode gràfic
1. **Settings** → **Network** → icona roda dentada (Wired)
2. Pestanya **IPv4**
3. Mode **Manual**
4. Introdueix:
   - Address: `10.0.20.20`
   - Netmask: `24`
   - Gateway: `10.0.20.1`
   - DNS: `10.0.30.10, 8.8.8.8`
5. Apply

## 2.4 Ubuntu 24.04 — fitxer Netplan
Edita:
```bash
sudo nano /etc/netplan/01-netcfg.yaml
```

Fitxer correcte (exemple):
```yaml
network:
  version: 2
  renderer: NetworkManager
  ethernets:
    enp0s3:
      dhcp4: false
      addresses:
        - 10.0.20.20/24
      routes:
        - to: default
          via: 10.0.20.1
      nameservers:
        addresses:
          - 10.0.30.10
          - 8.8.8.8
```

Aplica:
```bash
sudo netplan generate
sudo netplan apply
```

---

## 2.5 Validació de connectivitat (a les dues màquines)

### Windows
```bat
ipconfig
ping 10.0.10.1
ping 10.0.30.20
ping 8.8.8.8
nslookup google.com
```

### Ubuntu
```bash
ip a
ip r
ping -c 4 10.0.20.1
ping -c 4 10.0.30.20
ping -c 4 8.8.8.8
nslookup google.com
```

---

## [2 punts] 3) Resolució de problemes

### Cas 1
**Problema:** `PC_Enginyer_1` arriba als servidors interns però no navega ni fa ping a `8.8.8.8`.

**Diagnosi:** Falta o és incorrecta la **porta d’enllaç predeterminada**.  
**Solució:** posar GW de la seva subxarxa (p. ex. `10.0.10.1`).

Comprovació:
- Windows: `ipconfig /all` i `route print`
- Linux: `ip r` (ha d’existir `default via ...`)

---

### Cas 2
**Problema:** mateix switch però sense connectivitat:
- `PC_Enginyer_1: 10.0.1.15/24`
- `Portàtil_Admin: 10.0.2.20/24`

**Diagnosi:** Subxarxes diferents (`10.0.1.0/24` i `10.0.2.0/24`), sense routing no es veuen.

**Solució correcta (si han d’estar a la mateixa LAN):**
- `PC_Enginyer_1: 10.0.1.15/24`
- `Portàtil_Admin: 10.0.1.20/24`
- GW (si cal): `10.0.1.1`

---

### Cas 3
**Problema:** Linux pot fer ping a `1.1.1.1` però no a `www.google.com`.

**Diagnosi:** Error de **DNS** (IP/routing funcionen).  
**Solució:** configurar DNS vàlid (`8.8.8.8`, `1.1.1.1` o DNS intern correcte).

Validació:
```bash
nslookup www.google.com
```
Si retorna adreces IP, resolt.

---

### Cas 4
**Problema:** `sudo netplan apply` dona error de format YAML a `/etc/netplan/01-netcfg.yaml`.

**Error habitual:** indentació incorrecta, ús de tabs o estructura mal alineada.

**Fitxer corregit (model):**
```yaml
network:
  version: 2
  renderer: NetworkManager
  ethernets:
    enp0s3:
      dhcp4: false
      addresses:
        - 10.0.1.50/24
      routes:
        - to: default
          via: 10.0.1.1
      nameservers:
        addresses:
          - 8.8.8.8
          - 1.1.1.1
```

Comandes:
```bash
sudo netplan generate
sudo netplan apply
```

---

## Annex: Configuració Packet Tracer (adreçament 10.0.0.0)

### Dispositius
- Router 2911 (R1)
- SW-Core (2960)
- SW-Access (2960)
- SRV1
- PC-Enginyer1
- Portatil-Admin

### VLAN/IP
- VLAN10: `10.0.10.0/24` GW `10.0.10.1`
- VLAN20: `10.0.20.0/24` GW `10.0.20.1`
- VLAN30: `10.0.30.0/24` GW `10.0.30.1`

Hosts:
- PC-Enginyer1: `10.0.10.15/24` GW `10.0.10.1`
- Portatil-Admin: `10.0.20.20/24` GW `10.0.20.1`
- SRV1: `10.0.30.10/24` GW `10.0.30.1`

### Router-on-a-stick
```plaintext
enable
conf t
hostname R1

interface g0/0
 no shutdown

interface g0/0.10
 encapsulation dot1Q 10
 ip address 10.0.10.1 255.255.255.0

interface g0/0.20
 encapsulation dot1Q 20
 ip address 10.0.20.1 255.255.255.0

interface g0/0.30
 encapsulation dot1Q 30
 ip address 10.0.30.1 255.255.255.0

end
wr
```

### Testos mínims
- Des de Enginyeria:
  - `ping 10.0.10.1`
  - `ping 10.0.20.20`
  - `ping 10.0.30.10`
- Des d’Administració:
  - `ping 10.0.20.1`
  - `ping 10.0.10.15`
  - `ping 10.0.30.10`