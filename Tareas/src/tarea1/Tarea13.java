package tarea1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tarea13 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		float cant;
		int b500=0, b200=0, b100=0, b50=0, b20=0, b10=0, b5=0, m2=0, m1=0, m050=0, m020=0, m010=0, m005=0, m002=0, m001=0;
		
		System.out.println("Introduce una cantidad de dinero: ");
		cant = Float.parseFloat(in.readLine());
		
		if(cant < 0) {
			
			System.out.println("error");
			
		}else {
			
			//Billetes
			
			while(cant>=500) {
				
				b500++;
				cant = cant-500;
				
			}
			
			while(cant>=200) {
				
				b200++;
				cant = cant-200;
				
			}
			
			while(cant>=100) {
				
				b100++;
				cant = cant-100;
				
			}
			
			while(cant>=50) {
				
				b50++;
				cant = cant-50;
				
			}

			while(cant>=20) {
		
				b20++;
				cant = cant-20;
		
			}

			while(cant>=10) {
		
				b10++;
				cant = cant-10;
		
			}

			while(cant>=5) {
		
				b5++;
				cant = cant-5;
		
			}

			//Monedas
			
			while(cant>=2) {
		
				m2++;
				cant = cant-2;
		
			}
			
			while(cant>=1) {
				
				m1++;
				cant = cant-1;
		
			}
			
			while(cant>=0.50) {
				
				m050++;
				cant = (float) (cant-0.50);
		
			}
			
			while(cant>=0.20) {
				
				m020++;
				cant = (float) (cant-0.20);
		
			}
			
			while(cant>=0.10) {
				
				m010++;
				cant = (float) (cant-0.10);
		
			}
			
			while(cant>=0.05) {
				
				m005++;
				cant = (float) (cant-0.05);
		
			}
			
			while(cant>=0.02) {
				
				m002++;
				cant = (float) (cant-0.02);
		
			}

			while(cant>=0.01) {
		
				m001++;
				cant = (float) (cant-0.01);

			}
			
			//Mostramos la cantidad de billetes y monedas necesarias
			
			if(b500>1) {
				
				System.out.println(b500+" billetes de 500€");
				
			}else if(b500 == 0){
				
			}else {
				
				System.out.println(b500+" billete de 500€");
				
			}
			
			if(b200>1) {
				
				System.out.println(b200+" billetes de 200€");
				
			}else if(b200 == 0){
				
			}else {
				
				System.out.println(b200+" billete de 200€");
				
			}
			
			if(b100>1) {
				
				System.out.println(b100+" billetes de 100€");
				
			}else if(b100 == 0){
				
			}else {
				
				System.out.println(b100+" billete de 100€");
				
			}
			
			if(b50>1) {
				
				System.out.println(b50+" billetes de 50€");
				
			}else if(b50 == 0){
				
			}else {
				
				System.out.println(b50+" billete de 50€");
				
			}
			
			if(b20>1) {
				
				System.out.println(b20+" billetes de 20€");
				
			}else if(b20 == 0){
				
			}else{
				
				System.out.println(b20+" billete de 20€");
				
			}
			
			if(b10>1) {
				
				System.out.println(b10+" billetes de 10€");
				
			}else if(b10 == 0){
				
			}else{
				
				System.out.println(b10+" billete de 10€");
				
			}
			
			if(b5>1) {
				
				System.out.println(b5+" billetes de 5€");
				
			}else if(b5 == 0){
				
			}else{
				
				System.out.println(b5+" billete de 5€");
				
			}
			
			if(m2>1) {
				
				System.out.println(m2+" monedas de 2€");
				
			}else if(m2 == 0){
				
			}else{
				
				System.out.println(m2+" moneda de 2€");
				
			}
			
			if(m1>1) {
				
				System.out.println(m1+" monedas de 1€");
				
			}else if(m1 == 0){
				
			}else{
				
				System.out.println(m1+" moneda de 1€");
				
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
				
				System.out.println(m001+" monedas de 1 céntimos");
				
			}else if(m001 == 0){
				
			}else{
				
				System.out.println(m001+" moneda de 1 céntimos");
				
			}
			
		}
			
	}

}
