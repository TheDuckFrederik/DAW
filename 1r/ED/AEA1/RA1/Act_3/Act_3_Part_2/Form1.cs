namespace Act_3_Part_2
{
	public partial class Form1 : Form
	{
		//
		public Form1()
		{
			InitializeComponent();
			// Inicialitzem amb "NORMAL" el valor de Prioritat
			prioritat.Text = "NORMAL";
			//
		}
		//
		public void llistaPerFer_ItemCheck(object sender, ItemCheckEventArgs e)
		{
			// Comprovem si s'ha marcat una casella
			if (e.NewValue == CheckState.Checked) {
				// Obtenir l'element marcat
				object elementMogut = llistaPerFer.Items[e.Index];
				//
				// Copiar l'element a la llista de tasques acabades
				llistaAcabats.Items.Add(elementMogut);
				//
				// Eliminar l'element en la llista de tasques per fer, ho fem amb BeginInvoke perque si no dona error al procesar la llista mentre s'esta usant
				this.BeginInvoke(new Action(() => {
					llistaPerFer.Items.Remove(elementMogut);
				}));
				//
			}
			//
		}
		//
		private void botoAfegirTasca_Click(object sender, EventArgs e)
		{
			// Aquest if es per comprovar que l'usuari hagi escrit un nom de tasca i haguin escollit prioritat abans de donar al boto. Si falta alguna cosa es mostra un missatge d'alerta, i si tot esta be la tasca s'afegeix a la llista TODO.
			if (string.IsNullOrWhiteSpace(nomTascaNova.Text) && string.IsNullOrEmpty(prioritat.Text)) {
				MessageBox.Show("Has de crear el nom de la tasca i escollir la seva prioritat.");
				// Condicio que mostra missatge d'alerta si no hi ha nom ni prioritat de tasca
			} else if (string.IsNullOrWhiteSpace(nomTascaNova.Text)) {
				MessageBox.Show("Has de crear el nom de la tasca.");
				// Condicio que mostra missatge d'alerta si no hi ha nom de tasca pero si prioritat
			} else if (string.IsNullOrWhiteSpace(prioritat.Text)) {
				MessageBox.Show("Has d'escollir la prioritat de la tasca.");
				// Condicio que mostra missatge d'alerta si no hi ha prioritat de tasca pero si nom
			} else {
				string tasca = $"[{prioritat.Text}] - {nomTascaNova.Text}";
				llistaPerFer.Items.Add(tasca);
				// Afegim la tasca a la llista TODO amb el format [PRIORITAT] - Nom de la tasca
				//
				// Restableeix els valors Nom de la tasca (Buit) i Prioritat ("NORMAL")
				nomTascaNova.Text = "";
				prioritat.Text = "NORMAL";
				//
			}
			//
		}
		//
		private void botoEliminarTasca_Click(object sender, EventArgs e)
		{
			// Aquest if es per comprovar que hi hagi una tasca seleccionada abans d'esborrar. Si no n'hi ha cap es mostra un missatge d'alerta, i si n'hi ha una s'elimina de la llista TODO.
			if (llistaPerFer.SelectedIndex == -1) {
				MessageBox.Show("Has de seleccionar una tasca.");
				// Condicio que mostra missatge d'alerta si no hi cap tasca seleccionada
			} else {
				llistaPerFer.Items.RemoveAt(llistaPerFer.SelectedIndex);
				// Condicio que elimina la tasca seleccionada
			}
			//
		}
		//
	}
	//
}
// Quack
