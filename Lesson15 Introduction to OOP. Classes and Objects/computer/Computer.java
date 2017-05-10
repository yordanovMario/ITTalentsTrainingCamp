package computer;

public class Computer {
	int year;
	double price;
	boolean isNotebook;
	double hardDiskMemory;
	double freeMemory;
	String operationSystem;
	
	Computer(){
		this.isNotebook = false;
		this.operationSystem = "Win XP";
	}
	
	Computer(int year, double price, double hardDiskMemory, double freeMemory){
		this();
		if(year > 2000){
			this.year = year;
		}
		if(price > 0){
			this.price = price;
		}
		if(hardDiskMemory > 0){
			this.hardDiskMemory = hardDiskMemory;
		}
		if(freeMemory > 0 && freeMemory <= hardDiskMemory){
			this.freeMemory = freeMemory;
		}
			
	}
	
	Computer(int year, double price, boolean isNotebook, double hardDiskMemory, double freeMemory, String operationSystem){
		if(year > 2000){
			this.year = year;
		}
		if(price > 0){
			this.price = price;
		}
		if(hardDiskMemory > 0 && hardDiskMemory < 3500){
			this.hardDiskMemory = hardDiskMemory;
		}
		if(freeMemory > 0 && freeMemory <= hardDiskMemory){
			this.freeMemory = freeMemory;
		}
		if(!operationSystem.isEmpty()){
			this.operationSystem = operationSystem;
		}
			
	}
	
	void useMemory(int memory){
		if(memory > 0){
			if(memory > freeMemory){
				System.out.println("Not enough memory!");
			}
			else{
				freeMemory -= memory;
			}
		}
	}
	
	void changeOperationSystem(String newOperationSystem){
		if(!newOperationSystem.isEmpty()){
			this.operationSystem = newOperationSystem;
		}
	}

	int comparePrice(Computer computer){
		if(this.price == computer.price){
			return 0;
		}
		else{
			if(this.price > computer.price){
				return -1;
			}
			else{
				return 1;
			}
		}
	}
	
}
