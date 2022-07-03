package com.exemplo.patterns.factory.cliente;

import com.exemplo.patterns.factory.biblioteca.comunicacao.GeraEmail;
import com.exemplo.patterns.factory.cliente.xml.EmailXML;

import javax.swing.*;

public class GeraEmailsXML {

    public static void main(String[] args) {
        GeraEmail geraEmail = new EmailXML("contatos.xml");
        String corpoEmail = JOptionPane.showInputDialog(null, "Informe a mensagem:");
        boolean status = geraEmail.enviarEmail(corpoEmail);

        if (status) {
            JOptionPane.showMessageDialog(null,"E-mails enviados!");
        } else {
            JOptionPane.showMessageDialog(null,"Erro ao enviar E-mails!");
        }
    }
}
