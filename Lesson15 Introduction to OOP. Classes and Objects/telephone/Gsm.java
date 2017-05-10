package telephone;

public class Gsm {
	String model;
	boolean hasSimCard = false;
	String simMobileNumber;
	double outgoingCallsDuration;
	Call lastIncomingCall;
	Call lastOutgoingCall;
	
	Gsm(String model){
		if(!model.isEmpty()){
			this.model = model;
		}
	}
	
	void insertSimCard(String simMobileNumber){
		if(simMobileNumber.matches("(08)[0-9]{8}")){
			this.simMobileNumber = simMobileNumber;
			this.hasSimCard = true;
		}
		else{
			System.out.println("Invalid SIM Card number!");
		}
	}
	
	void removeSimCard(){
		this.hasSimCard = false;
	}
	
	void call(Gsm receiver, double duration){
		if(duration <= 0 || duration > 60){
			System.out.println("Invalid call duration!");
			return;
		}
		if(!this.hasSimCard){
			System.out.println("No SIM Card!");
			return;
		}
		if(!receiver.hasSimCard){
			System.out.println("The subscriber's telephone is not switched on!");
			return;
		}
		if(this.simMobileNumber.equals(receiver.simMobileNumber)){
			System.out.println("");
			return;
		}
		
		Call call = new Call();
		call.duration = duration;
		call.receiver = receiver;
		call.caller = this;
		
		this.lastOutgoingCall = call;
		receiver.lastIncomingCall = call;
		this.outgoingCallsDuration += duration;
			
	}
	
	void printInfoForTheLastOutgoingCall(){
		if(lastOutgoingCall != null){
			System.out.println("Last outgoing call to: " + this.lastOutgoingCall.receiver.simMobileNumber + ".");
			System.out.println("Duration: " + this.lastOutgoingCall.duration + " minutes.");
			System.out.println();
		}
		else{
			System.out.println("No info available!");
		}
	}
	
	void printInfoForTheLastIncomingCall(){
		if(lastIncomingCall != null){
			System.out.println("Last incoming call from: " + this.lastIncomingCall.caller.simMobileNumber + ".");
			System.out.println("Duration: " + this.lastIncomingCall.duration + " minutes.");
			System.out.println();
		}
		else{
			System.out.println("No info available!");
		}
	}
	
	double getSumForCall(){
		System.out.print("Amount due for outgoing calls in BGN: ");
		return this.outgoingCallsDuration * Call.priceForAMinute;
	}
	
}
