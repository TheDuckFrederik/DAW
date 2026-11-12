namespace Act_3_Part_2
{
    partial class Form1
    {
        /// <summary>
        ///  Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        ///  Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        ///  Required method for Designer support - do not modify
        ///  the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            llistaPerFer = new CheckedListBox();
            llistaAcabats = new ListBox();
            botoEliminarTasca = new Button();
            nomTascaNova = new TextBox();
            prioritat = new ComboBox();
            botoAfegirTasca = new Button();
            label1 = new Label();
            label2 = new Label();
            label3 = new Label();
            label4 = new Label();
            SuspendLayout();
            // 
            // llistaPerFer
            // 
            llistaPerFer.BackColor = Color.Ivory;
            llistaPerFer.FormattingEnabled = true;
            llistaPerFer.Location = new Point(147, 141);
            llistaPerFer.Name = "llistaPerFer";
            llistaPerFer.Size = new Size(417, 400);
            llistaPerFer.TabIndex = 0;
            llistaPerFer.ItemCheck += llistaPerFer_ItemCheck;
            // 
            // llistaAcabats
            // 
            llistaAcabats.BackColor = Color.Linen;
            llistaAcabats.FormattingEnabled = true;
            llistaAcabats.Location = new Point(671, 141);
            llistaAcabats.Name = "llistaAcabats";
            llistaAcabats.Size = new Size(417, 388);
            llistaAcabats.TabIndex = 1;
            // 
            // botoEliminarTasca
            // 
            botoEliminarTasca.Location = new Point(147, 559);
            botoEliminarTasca.Name = "botoEliminarTasca";
            botoEliminarTasca.Size = new Size(219, 46);
            botoEliminarTasca.TabIndex = 2;
            botoEliminarTasca.Text = "Eliminar tasca";
            botoEliminarTasca.UseVisualStyleBackColor = true;
            botoEliminarTasca.Click += botoEliminarTasca_Click;
            // 
            // nomTascaNova
            // 
            nomTascaNova.Location = new Point(147, 699);
            nomTascaNova.Name = "nomTascaNova";
            nomTascaNova.Size = new Size(417, 39);
            nomTascaNova.TabIndex = 3;
            // 
            // prioritat
            // 
            prioritat.FormattingEnabled = true;
            prioritat.Items.AddRange(new object[] { "BAIXA", "MITJANA", "ALTA" });
            prioritat.Location = new Point(641, 698);
            prioritat.Name = "prioritat";
            prioritat.Size = new Size(242, 40);
            prioritat.TabIndex = 4;
            // 
            // botoAfegirTasca
            // 
            botoAfegirTasca.Location = new Point(947, 695);
            botoAfegirTasca.Name = "botoAfegirTasca";
            botoAfegirTasca.Size = new Size(141, 46);
            botoAfegirTasca.TabIndex = 5;
            botoAfegirTasca.Text = "Afegir";
            botoAfegirTasca.UseVisualStyleBackColor = true;
            botoAfegirTasca.Click += botoAfegirTasca_Click;
            // 
            // label1
            // 
            label1.AutoSize = true;
            label1.Location = new Point(148, 658);
            label1.Name = "label1";
            label1.Size = new Size(245, 32);
            label1.TabIndex = 6;
            label1.Text = "Nom de la nova tasca";
            // 
            // label2
            // 
            label2.AutoSize = true;
            label2.Location = new Point(641, 658);
            label2.Name = "label2";
            label2.Size = new Size(97, 32);
            label2.TabIndex = 7;
            label2.Text = "Prioritat";
            // 
            // label3
            // 
            label3.AutoSize = true;
            label3.Location = new Point(307, 96);
            label3.Name = "label3";
            label3.Size = new Size(98, 32);
            label3.TabIndex = 8;
            label3.Text = "PER FER";
            // 
            // label4
            // 
            label4.AutoSize = true;
            label4.Location = new Point(811, 96);
            label4.Name = "label4";
            label4.Size = new Size(130, 32);
            label4.TabIndex = 9;
            label4.Text = "ACABADES";
            // 
            // Form1
            // 
            AutoScaleDimensions = new SizeF(13F, 32F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(1259, 796);
            Controls.Add(label4);
            Controls.Add(label3);
            Controls.Add(label2);
            Controls.Add(label1);
            Controls.Add(botoAfegirTasca);
            Controls.Add(prioritat);
            Controls.Add(nomTascaNova);
            Controls.Add(botoEliminarTasca);
            Controls.Add(llistaAcabats);
            Controls.Add(llistaPerFer);
            Name = "Form1";
            Text = "Form1";
            ResumeLayout(false);
            PerformLayout();
        }

        #endregion

        private CheckedListBox llistaPerFer;
        private ListBox llistaAcabats;
        private Button botoEliminarTasca;
        private TextBox nomTascaNova;
        private ComboBox prioritat;
        private Button botoAfegirTasca;
        private Label label1;
        private Label label2;
        private Label label3;
        private Label label4;
    }
}
