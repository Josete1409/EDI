package es.unex.cum.edi.tarea1;

import java.io.IOException;
import java.util.Scanner;

public class Tarea13 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		Scanner in = new Scanner (System.in);
		
		int cant = 0, b500=0, b200=0, b100=0, b50=0, b20=0, b10=0, b5=0, m2=0, m1=0, m050=0, m020=0, m010=0, m005=0, m002=0, m001=0;
		
		System.out.println("Introduce una cantidad de dinero: ");
		cant = (int)(in.nextDouble()*100); // Pasamos la cantidad a centimos.
		in.close();
		
		if(cant < 0) {
			
			System.out.println("error");
			
		}else {
			
			//Billetes
			
			while(cant>=50000) {
				
				b500++;
				cant = cant-50000;
				
			}
			
			while(cant>=20000) {
				
				b200++;
				cant = cant-20000;
				
			}
			
			while(cant>=10000) {
				
				b100++;
				cant = cant-10000;
				
			}
			
			while(cant>=5000) {
				
				b50++;
				cant = cant-5000;
				
			}

			while(cant>=2000) {
		
				b20++;
				cant = cant-2000;
		
			}

			while(cant>=1000) {
		
				b10++;
				cant = cant-1000;
		
			}

			while(cant>=500) {
		
				b5++;
				cant = cant-500;
		
			}

			//Monedas
			
			while(cant>=200) {
		
				m2++;
				cant = cant-200;
		
			}
			
			while(cant>=100) {
				
				m1++;
				cant = cant-100;
		
			}
			
			while(cant>=50) {
				
				m050++;
				cant = (cant-50);
		
			}
			
			while(cant>=20) {
				
				m020++;
				cant = (cant-20);
		
			}
			
			while(cant>=10) {
				
				m010++;
				cant = (cant-10);
		
			}
			
			while(cant>=5) {
				
				m005++;
				cant = (cant-5);
		
			}
			
			while(cant>=2) {
				
				m002++;
				cant = (cant-2);
		
			}

			while(cant>=1) {
		
				m001++;
				cant = (cant-1);

			}
			
			//Mostramos la cantidad de billetes y monedas necesarias
			
			if(b500>1) {
				
				System.out.println(b500+" billetes de 500 euros");
				
			}else if(b500 == 0){
				
			}else {
				
				System.out.println(b500+" billete de 500 euros");
				
			}
			
			if(b200>1) {
				
				System.out.println(b200+" billetes de 200 euros");
				
			}else if(b200 == 0){
				
			}else {
				
				System.out.println(b200+" billete de 200 euros");
				
			}
			
			if(b100>1) {
				
				System.out.println(b100+" billetes de 100 euros");
				
			}else if(b100 == 0){
				
			}else {
				
				System.out.println(b100+" billete de 100 euros");
				
			}
			
			if(b50>1) {
				
				System.out.println(b50+" billetes de 50 euros");
				
			}else if(b50 == 0){
				
			}else {
				
				System.out.println(b50+" billete de 50 euros");
				
			}
			
			if(b20>1) {
				
				System.out.println(b20+" billetes de 20 euros");
				
			}else if(b20 == 0){
				
			}else{
				
				System.out.println(b20+" billete de 20 euros");
				
			}
			
			if(b10>1) {
				
				System.out.println(b10+" billetes de 10 euros");
				
			}else if(b10 == 0){
				
			}else{
				
				System.out.println(b10+" billete de 10 euros");
				
			}
			
			if(b5>1) {
				
				System.out.println(b5+" billetes de 5 euros");
				
			}else if(b5 == 0){
				
			}else{
				
				System.out.println(b5+" billete de 5 euros");
				
			}
			
			if(m2>1) {
				
				System.out.println(m2+" monedas de 2 euros");
				
			}else if(m2 == 0){
				
			}else{
				
				System.out.println(m2+" moneda de 2 euros");
				
			}
			
			if(m1>1) {
				
				System.out.println(m1+" monedas de 1 euro");
				
			}else if(m1 == 0){
				
			}else{
				
				System.out.println(m1+" moneda de 1 euro");
				
			}
			
			if(m050>1) {
				
				System.out.println(m050+" monedas de 50 céntimos");
				
			}else if(m050 == 0){
				
			}else{
				
				System.out.println(m050+" moneda de 50 céntimos");
				
			}
			
			if(m020>1) {
				
				System.out.println(m020+" monedas de 20 céntimos");
				
			}else if(m020 == 0){
				
			}else{
				
				System.out.println(m020+" moneda de 20 céntimos");
				
			}
			
			if(m010>1) {
				
				System.out.println(m010+" monedas de 10 céntimos");
				
			}else if(m010 == 0){
				
			}else{
				
				System.out.println(m010+" moneda de 10 céntimos");
				
			}
			
			if(m005>1) {
				
				System.out.println(m005+" monedas de 5 céntimos");
				
			}else if(m005 == 0){
				
			}else{
				
				System.out.println(m005+" moneda de 5 céntimos");
				
			}
			
			if(m002>1) {
				
				System.out.println(m002+" monedas de 2 céntimos");
				
			}else if(m002 == 0){
				
			}else{
				
				System.out.println(m002+" moneda de 2 céntimos");
				
			}
			
			if(m001>1) {
				
				System.out.println(m001+" monedas de 1 céntimo");
				
			}else if(m001 == 0){
				
			}else{
				
				System.out.println(m001+" moneda de 1 céntimo");
				
			}
			
		}
			
	}

}
