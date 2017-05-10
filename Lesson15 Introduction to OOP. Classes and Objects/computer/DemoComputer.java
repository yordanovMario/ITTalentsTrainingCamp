package computer;

public class DemoComputer {

	public static void main(String[] args) {
		Computer macBook = new Computer();
		macBook.year = 2012;
		macBook.price = 2099.99;
		macBook.hardDiskMemory = 256;
		macBook.freeMemory = 108;
		macBook.operationSystem = "Mac OS";
		macBook.isNotebook = true;
		
		Computer pc = new Computer();
		pc.year = 2015;
		pc.price = 1000;
		pc.hardDiskMemory = 512;
		pc.freeMemory = 169;
		pc.operationSystem = "Windows";
		pc.isNotebook = false;
		
		Computer asus = new Computer(2016, 4000, true, 1024, 450, "Windows 10");
		Computer lenovo = new Computer(2014, 1500, 512, 300);
		
		macBook.useMemory(100);
		pc.changeOperationSystem("Linux");
		
		System.out.println("The MacBook is manufactured in " + macBook.year + " and the stationary PC in " + pc.year + ".");
		System.out.println("The MacBook costs " + macBook.price + " BGN and the stationary PC costs " + pc.price + "BGN.");
		System.out.println("The MacBook has " + macBook.hardDiskMemory + " GB and the stationary PC has " + pc.hardDiskMemory + " GB hard disk memory.");
		System.out.println("The MacBook has " + macBook.freeMemory + " GB and the stationary PC has " + pc.freeMemory + " GB free memory.");
		System.out.println("The operation system of the MacBook is " + macBook.operationSystem + " and the stationary PC's is " + pc.operationSystem + ".");
		System.out.println(pc.isNotebook ? "The stationary PC is a notebook" : "The stationary PC is a notebook");
		System.out.println(macBook.isNotebook ? "The MacBook is a notebook" : "The MacBook is a notebook");
		
		macBook.comparePrice(asus);
		
	}

}
