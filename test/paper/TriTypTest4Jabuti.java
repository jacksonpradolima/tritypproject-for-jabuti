/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paper;

import org.junit.Test;

/**
 * Test Class for TriTyp Project
 * 
 * @author Thiago Nascimento
 * @since 2015-05-13
 * @version 1.0
 */
public class TriTypTest4Jabuti {
    
	@Test
	public void casoDeTeste01() {
		TriTyp instance = new TriTyp();
		instance.setI(-10);
	}

	@Test
	public void casoDeTeste02() {
		TriTyp instance = new TriTyp();
		instance.setI(0);
	}

	@Test
	public void casoDeTeste03() {
		TriTyp instance = new TriTyp();
		instance.setI(10);
	}

	@Test
	public void casoDeTeste04() {
		TriTyp instance = new TriTyp();
		instance.setI(Integer.MAX_VALUE);
	}

	@Test
	public void casoDeTeste05() {
		TriTyp instance = new TriTyp();
		instance.setI(Integer.MIN_VALUE);
	}

	@Test
	public void casoDeTeste06() {
		TriTyp instance = new TriTyp();
		instance.setJ(-10);
	}

	@Test
	public void casoDeTeste07() {
		TriTyp instance = new TriTyp();
		instance.setJ(0);
	}

	@Test
	public void casoDeTeste08() {
		TriTyp instance = new TriTyp();
		instance.setJ(10);
	}

	@Test
	public void casoDeTeste09() {
		TriTyp instance = new TriTyp();
		instance.setJ(Integer.MAX_VALUE);
	}

	@Test
	public void casoDeTeste10() {
		TriTyp instance = new TriTyp();
		instance.setJ(Integer.MIN_VALUE);
	}

	@Test
	public void casoDeTeste11() {
		TriTyp instance = new TriTyp();
		instance.setK(-10);
	}

	@Test
	public void casoDeTeste12() {
		TriTyp instance = new TriTyp();
		instance.setK(0);
	}

	@Test
	public void casoDeTeste13() {
		TriTyp instance = new TriTyp();
		instance.setK(10);
	}

	@Test
	public void casoDeTeste14() {
		TriTyp instance = new TriTyp();
		instance.setK(Integer.MAX_VALUE);
	}

	@Test
	public void casoDeTeste15() {
		TriTyp instance = new TriTyp();
		instance.setK(Integer.MIN_VALUE);
	}

	@Test
	public void casoDeTeste16() {
		TriTyp instance = new TriTyp();
		instance = new TriTyp();
		instance.setI(1);
		instance.setJ(1);
		instance.setK(1);
	}

	@Test
	public void casoDeTeste17() {
		TriTyp instance = new TriTyp();
	}

	@Test
	public void casoDeTeste18() {
		TriTyp instance = new TriTyp();
	}

	@Test
	public void casoDeTeste19() {
		TriTyp instance = new TriTyp();
	}

	@Test
	public void casoDeTeste20() {
		TriTyp instance = new TriTyp();
		String pattern = "[-]?\\d+-[-]?\\d+-[-]?\\d+: \\d+";
		instance.setI(1);
		instance.setJ(2);
		instance.setK(3);
		instance.setI(1);
		instance.setJ(-2);
		instance.setK(3);
	}
	
	@Test
	public void casoDeTeste21(){
		TriTyp instance = new TriTyp();
		instance.toString();
	}
	
	@Test
	public void casoDeTeste22(){
		TriTyp instance = new TriTyp();
		instance.toString();
	}
	
	@Test
	public void casoDeTeste23(){
		TriTyp instance = new TriTyp();
		instance.toString();
	}	
	
	@Test
	public void casoDeTeste24(){
		TriTyp instance = new TriTyp();
		instance.setI(60);
		instance.setJ(60);
		instance.setK(60);
		instance.type();
		instance.toString();
	}

	@Test
	public void casoDeTeste25() {
		TriTyp instanceOne = new TriTyp();
		TriTyp instanceTwo = new TriTyp();
		instanceOne = new TriTyp();
		instanceTwo = new TriTyp();
		instanceOne.setI(1);
		instanceTwo.setI(1);
	}

	@Test
	public void casoDeTeste26() {
		TriTyp instanceOne = new TriTyp();
		TriTyp instanceTwo = new TriTyp();
		instanceOne = new TriTyp();
		instanceTwo = new TriTyp();
		instanceOne.setJ(2);
		instanceTwo.setJ(2);
	}

	@Test
	public void casoDeTeste27() {
		TriTyp instanceOne = new TriTyp();
		TriTyp instanceTwo = new TriTyp();
		instanceOne = new TriTyp();
		instanceTwo = new TriTyp();
		instanceOne.setK(3);
		instanceTwo.setK(3);
	}

	@Test
	public void casoDeTeste28() {
		TriTyp instanceOne = new TriTyp();
		TriTyp instanceTwo = new TriTyp();
		instanceOne.setI(1);
		instanceOne.setJ(2);
		instanceOne.setK(3);
		instanceTwo.setI(1);
		instanceTwo.setJ(2);
		instanceTwo.setK(3);
	}

	@Test
	public void casoDeTeste29() {
		TriTyp instanceOne = new TriTyp();
		TriTyp instanceTwo = new TriTyp();
		instanceOne.setI(1);
		instanceOne.setJ(2);
		instanceOne.setK(3);
		instanceOne.type();
		instanceTwo.setI(1);
		instanceTwo.setJ(2);
		instanceTwo.setK(3);
		instanceTwo.type();
	}

	@Test
	public void casoDeTeste30() {
		TriTyp instanceOne = new TriTyp();
		TriTyp instanceTwo = new TriTyp();
		instanceOne.setI(1);
		instanceOne.setJ(2);
		instanceOne.setK(3);
		instanceTwo.setI(3);
		instanceTwo.setJ(2);
		instanceTwo.setK(1);
	}

	@Test
	public void casoDeTeste31() {
		TriTyp instanceOne = new TriTyp();
		TriTyp instanceTwo = new TriTyp();
		instanceOne.setI(1);
		instanceOne.setJ(2);
		instanceOne.setK(3);
		instanceOne.type();
		instanceTwo.setI(3);
		instanceTwo.setJ(2);
		instanceTwo.setK(1);
		instanceTwo.type();
	}

	@Test
	public void casoDeTeste32() {
		TriTyp instance = new TriTyp();
		instance.equals(new Object());
	}

	@Test
	public void casoDeTeste33() {
		TriTyp instance = new TriTyp();
		instance.equals(null);
	}

	@Test
	public void casoDeTeste34() {
		TriTyp instanceOne = new TriTyp();
		TriTyp instanceTwo = new TriTyp();
		instanceOne.equals(instanceTwo);
		instanceTwo.equals(instanceOne);
	}

	@Test
	public void casoDeTeste35() {
		TriTyp instanceOne = new TriTyp();
		TriTyp instanceTwo = new TriTyp();
		instanceOne.setI(1);
		instanceOne.setJ(2);
		instanceOne.setK(3);
		instanceOne.type(); // Only this
		instanceTwo.setI(1);
		instanceTwo.setJ(2);
		instanceTwo.setK(3);
	}
	
	@Test
	public void casoDeTeste36() {
		TriTyp instanceOne = new TriTyp();
		TriTyp instanceTwo = new TriTyp();
		instanceOne.setI(1);
		instanceOne.setJ(2);
		instanceOne.setK(3);
		instanceOne.type();
		instanceTwo.setI(2);
		instanceTwo.setJ(2);
		instanceTwo.setK(3);
		instanceTwo.type();
	}
	
	@Test
	public void casoDeTeste37() {
		TriTyp instanceOne = new TriTyp();
		TriTyp instanceTwo = new TriTyp();
		instanceOne.setI(1);
		instanceOne.setJ(2);
		instanceOne.setK(3);
		instanceOne.type();
		instanceTwo.setI(1);
		instanceTwo.setJ(4);
		instanceTwo.setK(3);
		instanceTwo.type();
	}
	
	@Test
	public void casoDeTeste38() {
		TriTyp instanceOne = new TriTyp();
		TriTyp instanceTwo = new TriTyp();
		instanceOne.setI(5);
		instanceOne.setJ(5);
		instanceOne.setK(3);
		instanceOne.type();
		instanceTwo.setI(5);
		instanceTwo.setJ(4);
		instanceTwo.setK(5);
		instanceTwo.type();
	}
	
	@Test
	public void casoDeTeste39() {
		TriTyp instanceOne = new TriTyp();
		TriTyp instanceTwo = new TriTyp();
		instanceOne.setI(5);
		instanceOne.setJ(5);
		instanceOne.setK(3);
		instanceOne.type();
		instanceTwo.setI(5);
		instanceTwo.setJ(5);
		instanceTwo.setK(2);
		instanceTwo.type();
	}
	
	@Test
	public void casoDeTeste40() {
		TriTyp instanceOne = new TriTyp();
		TriTyp instanceTwo = new TriTyp();
		instanceOne.setI(2);
		instanceOne.setJ(5);
		instanceOne.setK(5);
		instanceOne.type();
		instanceTwo.setI(3);
		instanceTwo.setJ(5);
		instanceTwo.setK(5);
		instanceTwo.type();
	}
	
	@Test
	public void casoDeTeste41() {
		TriTyp instanceOne = new TriTyp();
		TriTyp instanceTwo = new TriTyp();
		instanceOne.setI(5);
		instanceOne.setJ(2);
		instanceOne.setK(5);
		instanceOne.type();
		instanceTwo.setI(5);
		instanceTwo.setJ(3);
		instanceTwo.setK(5);
		instanceTwo.type();
	}
	
	@Test
	public void casoDeTeste42() {
		TriTyp instanceOne = new TriTyp();
		TriTyp instanceTwo = new TriTyp();
		instanceOne.setI(3);
		instanceOne.setJ(5);
		instanceOne.setK(5);
		instanceOne.type();
		instanceTwo.setI(5);
		instanceTwo.setJ(5);
		instanceTwo.setK(4);
		instanceTwo.type();
//		System.out.println(instanceOne);
//		System.out.println(instanceTwo);
	}
	
	@Test
	public void casoDeTeste43() {
		TriTyp instanceOne = new TriTyp();
		TriTyp instanceTwo = new TriTyp();
		instanceOne.setI(3);
		instanceOne.setJ(5);
		instanceOne.setK(5);
		instanceOne.type();
		instanceTwo.setI(5);
		instanceTwo.setJ(4);
		instanceTwo.setK(5);
		instanceTwo.type();
	}
	
	@Test
	public void casoDeTeste44() {
		TriTyp instanceOne = new TriTyp();
		TriTyp instanceTwo = new TriTyp();
		instanceOne.setI(1);
		instanceOne.setJ(2);
		instanceOne.setK(3);
		instanceOne.type();
		instanceTwo.setI(1);
		instanceTwo.setJ(2);
		instanceTwo.setK(4);
		instanceTwo.type();
	}
	
	@Test
	public void casoDeTeste45() {
		TriTyp instanceOne = new TriTyp();
		TriTyp instanceTwo = new TriTyp();
		instanceOne.setI(10);
		instanceOne.setJ(10);
		instanceOne.setK(10);
		instanceOne.type();
		instanceTwo.setI(20);
		instanceTwo.setJ(20);
		instanceTwo.setK(20);
		instanceTwo.type();
	}
	
	@Test
	public void casoDeTeste46(){
		TriTyp instanceOne = new TriTyp();
		TriTyp instanceTwo = new TriTyp();		
		instanceOne.equals(instanceTwo);
	}
	
	@Test
	public void casoDeTeste47(){
		TriTyp instanceOne = new TriTyp();
		TriTyp instanceTwo = new TriTyp();		
		instanceOne.equals(instanceTwo);
	}
	
	@Test
	public void casoDeTeste48(){
		TriTyp instanceOne = new TriTyp();
		TriTyp instanceTwo = new TriTyp();
		
		instanceOne.equals(instanceTwo);
	}
	
	@Test
	public void casoDeTeste49(){
		TriTyp instanceOne = new TriTyp();
		TriTyp instanceTwo = new TriTyp();
		
		instanceOne.equals(instanceTwo);
	}
		
	@Test
	public void casoDeTeste50() {
		TriTyp instance = new TriTyp();
		instance.type();
	}

	@Test
	public void casoDeTeste51() {
		TriTyp instance = new TriTyp();
		instance.setI(-1);
		instance.type();
	}

	@Test
	public void casoDeTeste52() {
		TriTyp instance = new TriTyp();
		instance.setJ(-1);
		instance.type();
	}
	
	@Test
	public void casoDeTeste53() {
		TriTyp instance = new TriTyp();
		instance.setK(-1);
		instance.type();
	}

	@Test
	public void casoDeTeste54() {
		TriTyp instance = new TriTyp();
		instance.setI(10);
		instance.setJ(4);
		instance.setK(3);
		instance.type();
	}
	
	@Test
	public void casoDeTeste55() {
		TriTyp instance = new TriTyp();
		instance.setI(20);
		instance.setJ(20);
		instance.setK(20);
		instance.type();
	}

	@Test
	public void casoDeTeste56() {
		TriTyp instance = new TriTyp();
		instance.setI(13);
		instance.setJ(9);
		instance.setK(14);
		instance.type();
	}
	
	@Test
	public void casoDeTeste57() {
		TriTyp instance = new TriTyp();
		instance.setI(13);
		instance.setJ(13);
		instance.setK(10);
		instance.type();
	}

	@Test
	public void casoDeTeste58() {
		TriTyp instance = new TriTyp();
		instance.setI(13);
		instance.setJ(10);
		instance.setK(13);
		instance.type();
	}

	@Test
	public void casoDeTeste60() {
		TriTyp instance = new TriTyp();
		instance.setI(10);
		instance.setJ(13);
		instance.setK(13);
		instance.type();
	}
	
	@Test
	public void casoDeTeste61() {
		TriTyp instance = new TriTyp();
		instance.setI(3);
		instance.setJ(4);
		instance.setK(5);
		instance.type();
	}
	
	@Test
	public void casoDeTeste62() {
		TriTyp instance = new TriTyp();
		instance.setI(2);
		instance.setJ(1);
		instance.setK(1);
		instance.type();
	}
	
	@Test
	public void casoDeTeste63() {
		TriTyp instance = new TriTyp();
		instance.setI(1);
		instance.setJ(2);
		instance.setK(1);
		instance.type();
	}
	
	@Test
	public void casoDeTeste64() {
		TriTyp instance = new TriTyp();
		instance.setI(1);
		instance.setJ(1);
		instance.setK(2);
		instance.type();
	}
	
	@Test
	public void casoDeTeste65() {
		TriTyp instance = new TriTyp();
		instance.setI(0);
		instance.setJ(0);
		instance.setK(0);
		instance.type();
	}
	
	@Test
	public void casoDeTeste66() {
		TriTyp instance = new TriTyp();
		instance.setI(10);
		instance.setJ(11);
		instance.setK(12);
		instance.type();
	}
	
	@Test
	public void casoDeTeste67() {
		TriTyp instance = new TriTyp();
		instance.setI(12);
		instance.setJ(11);
		instance.setK(10);
		instance.type();
	}
	
	@Test
	public void casoDeTeste68() {
		TriTyp instance = new TriTyp();
		instance.setI(11);
		instance.setJ(12);
		instance.setK(10);
		instance.type();
	}
	
	@Test
	public void casoDeTeste69() {
		TriTyp instance = new TriTyp();
		instance.setI(11);
		instance.setJ(10);
		instance.setK(12);
		instance.type();
	}
	
	@Test
	public void casoDeTeste70() {
		TriTyp instance = new TriTyp();
		instance.setI(-10);
		instance.setJ(10);
		instance.setK(10);
		instance.type();
	}
	
	@Test
	public void casoDeTeste71() {
		TriTyp instance = new TriTyp();
		instance.setI(10);
		instance.setJ(-10);
		instance.setK(10);
		instance.type();
	}
	
	@Test
	public void casoDeTeste72() {
		TriTyp instance = new TriTyp();
		instance.setI(10);
		instance.setJ(10);
		instance.setK(-10);
		instance.type();
	}
	
	@Test
	public void casoDeTeste73() {
		TriTyp instanceOne = new TriTyp();
		instanceOne.setI(2);
		instanceOne.setJ(2);
		instanceOne.setK(2);
		instanceOne.type();
		
		TriTyp instanceTwo = new TriTyp();
		instanceTwo.setI(3);
		instanceTwo.setJ(3);
		instanceTwo.setK(3);
		instanceTwo.type();
		
	}
	

	@Test
	public void casoDeTeste74() {
		TriTyp instance = new TriTyp();
		instance.setI(90);
		instance.setJ(90);
		instance.setK(0);
		instance.type();
	}
	
	@Test
	public void casoDeTeste75() {
		TriTyp instance = new TriTyp();
		instance.setI(60);
		instance.setJ(60);
		instance.setK(60);
		instance.type();
	}
	
	@Test
	public void casoDeTeste76() {
		TriTyp instance = new TriTyp();
		instance.setI(90);
		instance.setJ(60);
		instance.setK(30);
		instance.type();
	}
	
	@Test
	public void casoDeTeste77() {
		TriTyp instance = new TriTyp();
		instance.setI(30);
		instance.setJ(60);
		instance.setK(90);
		instance.type();
	}
	
	@Test
	public void casoDeTeste78() {
		TriTyp instance = new TriTyp();
		instance.setI(30);
		instance.setJ(90);
		instance.setK(60);
		instance.type();
	}
	@Test
	public void casoDeTeste79() {
		TriTyp instance = new TriTyp();
		instance.setI(60);
		instance.setJ(90);
		instance.setK(30);
		instance.type();
	}
	
	@Test
	public void casoDeTeste80() {
		TriTyp instance = new TriTyp();
		instance.setI(45);
		instance.setJ(45);
		instance.setK(90);
		instance.type();
	}
	
	@Test
	public void casoDeTeste81() {
		TriTyp instance = new TriTyp();
		instance.setI(45);
		instance.setJ(90);
		instance.setK(45);
		instance.type();
	}
	
	@Test
	public void casoDeTeste82() {
		TriTyp instance = new TriTyp();
		instance.setI(90);
		instance.setJ(45);
		instance.setK(45);
		instance.type();
	}
	
	@Test
	public void casoDeTeste83() {
		TriTyp instance = new TriTyp();
		instance.setI(80);
		instance.setJ(80);
		instance.setK(20);
		instance.type();
	}
	
	@Test
	public void casoDeTeste84() {
		TriTyp instance = new TriTyp();
		instance.setI(80);
		instance.setJ(20);
		instance.setK(80);
		instance.type();
	}

	@Test
	public void casoDeTeste85() {
		TriTyp instance = new TriTyp();
		instance.setI(20);
		instance.setJ(80);
		instance.setK(80);
		instance.type();
	}
	
	@Test
	public void casoDeTeste86(){
		TriTyp instance = new TriTyp();
		instance.setI(5);
		instance.setJ(4);
		instance.setK(5);
		instance.type();
	}
	
	@Test
	public void casoDeTeste87(){
		TriTyp instance = new TriTyp();
		instance.setI(3);
		instance.setJ(5);
		instance.setK(5);
		instance.type();
	}
	
	@Test
	public void casoDeTeste88(){
		TriTyp instance = new TriTyp();
		instance.setI(3);
		instance.setJ(4);
		instance.setK(5);
		instance.type();
	}
	
	@Test
	public void casoDeTeste89(){
		TriTyp instance = new TriTyp();
		instance.setI(5);
		instance.setJ(5);
		instance.setK(5);
		instance.type();
	}
	
	@Test
	public void casoDeTeste90() {
		TriTyp instance = new TriTyp();
		instance.setI(5);
		instance.setJ(5);
		instance.setK(4);
		instance.type();
	}

	@Test
	public void casoDeTeste91() {
		TriTyp t = new TriTyp();
		t.setI(180);
		t.setJ(0);
		t.setK(0);
		t.type();
	}

	@Test
	public void casoDeTeste92() {
		TriTyp t = new TriTyp();
		t.setI(0);
		t.setJ(180);
		t.setK(0);
		t.type();
	}

	@Test
	public void casoDeTeste93() {
		TriTyp t = new TriTyp();
		t.setI(0);
		t.setJ(0);
		t.setK(180);
		t.type();
	}

	@Test
	public void casoDeTeste94() {
		TriTyp t = new TriTyp();
		t.setI(0);
		t.setJ(0);
		t.setK(0);
		t.type();
	}

	@Test
	public void casoDeTeste95() {
		TriTyp t = new TriTyp();
		t.setI(90);
		t.setJ(90);
		t.setK(0);
		t.type();
	}

	@Test
	public void casoDeTeste96() {
		TriTyp t = new TriTyp();
		t.setI(0);
		t.setJ(90);
		t.setK(90);
		t.type();
	}

	@Test
	public void casoDeTeste97() {
		TriTyp t = new TriTyp();
		t.setI(60);
		t.setJ(60);
		t.setK(60);
		t.type();
	}

	@Test
	public void casoDeTeste98() {
		TriTyp t = new TriTyp();
		t.setI(90);
		t.setJ(60);
		t.setK(30);
		t.type();
	}

	@Test
	public void casoDeTeste99() {
		TriTyp t = new TriTyp();
		t.setI(90);
		t.setJ(30);
		t.setK(60);
		t.type();
	}

	@Test
	public void casoDeTeste100() {
		TriTyp t = new TriTyp();
		t.setI(30);
		t.setJ(60);
		t.setK(90);
		t.type();
	}

	@Test
	public void casoDeTeste101() {
		TriTyp t = new TriTyp();
		t.setI(30);
		t.setJ(90);
		t.setK(60);
		t.type();
	}

	@Test
	public void casoDeTeste102() {
		TriTyp t = new TriTyp();
		t.setI(60);
		t.setJ(30);
		t.setK(90);
		t.type();
	}

	@Test
	public void casoDeTeste103() {
		TriTyp t = new TriTyp();
		t.setI(60);
		t.setJ(90);
		t.setK(30);
		t.type();
	}

	@Test
	public void casoDeTeste104() {
		TriTyp t = new TriTyp();
		t.setI(45);
		t.setJ(45);
		t.setK(90);
		t.type();
		t.type();
		
	}

	@Test
	public void casoDeTeste105() {
		TriTyp t = new TriTyp();
		t.setI(45);
		t.setJ(90);
		t.setK(45);
		t.type();
	}

	@Test
	public void casoDeTeste106() {
		TriTyp t = new TriTyp();
		t.setI(90);
		t.setJ(45);
		t.setK(45);
		t.type();
	}

	@Test
	public void casoDeTeste107() {
		TriTyp t = new TriTyp();
		t.toString();
	}

	@Test
	public void casoDeTeste108() {
		TriTyp t = new TriTyp();
		Object o = new Object();
		t.equals(o);
	}

	@Test
	public void casoDeTeste109() {
		TriTyp t = new TriTyp();
		TriTyp t1 = new TriTyp();
		t.equals(t1);
	}

	@Test
	public void casoDeTeste110() {
		TriTyp t = new TriTyp();
		t.setI(60);
		t.setJ(60);
		t.setK(60);
		TriTyp t1 = new TriTyp();
		t.equals(t1);
	}

	@Test
	public void casoDeTeste111() {
		TriTyp t = new TriTyp();
		t.setI(80);
		t.setJ(81);
		t.setK(82);
		t.type();
	}

	@Test
	public void casoDeTeste112() {
		TriTyp t = new TriTyp();
		t.setI(80);
		t.setJ(80);
		t.setK(20);
		t.type();
		t.type();
	}

	@Test
	public void casoDeTeste113() {
		TriTyp t = new TriTyp();
		t.setI(80);
		t.setJ(20);
		t.setK(80);
		t.type();
		t.type();
	}

	@Test
	public void casoDeTeste114() {
		TriTyp t = new TriTyp();
		t.setI(20);
		t.setJ(80);
		t.setK(80);
		t.type();
	}

	@Test
	public void casoDeTeste115() {
		TriTyp t = new TriTyp();
		t.setI(60);
		t.setJ(60);
		t.setK(60);
		t.type();
		TriTyp t1 = new TriTyp();
		t1.setI(60);
		t1.setJ(60);
		t1.setK(60);
		t.equals(t1);
	}

	@Test
	public void casoDeTeste116() {
		TriTyp t = new TriTyp();
		t.setI(60);
		t.setJ(60);
		t.setK(60);
		t.type();
		TriTyp t1 = new TriTyp();
		t1.setI(60);
		t1.setJ(30);
		t1.setK(60);
		t1.type();
		t.equals(t1);
	}

	@Test
	public void casoDeTeste117() {
		TriTyp t = new TriTyp();
		t.setI(60);
		t.setJ(60);
		t.setK(60);
		t.type();
		TriTyp t1 = new TriTyp();
		t1.setI(60);
		t1.setJ(60);
		t1.setK(30);
		t1.type();
		t.equals(t1);
	}

	@Test
	public void casoDeTeste118() {
		TriTyp t = new TriTyp();
		t.setI(70);
		t.setJ(50);
		t.setK(60);
		t.type();
		t.setI(70);
		t.setJ(40);
		t.setK(70);
		t.type();
	}

	@Test
	public void casoDeTeste119() {
		TriTyp t = new TriTyp();
		t.setI(70);
		t.setJ(50);
		t.setK(60);
		t.type();
		t.setI(70);
		t.setJ(70);
		t.setK(40);
		t.type();
	}
}
