package p3_12;

public class VotingMachineTester 
{

	public static void main(String[] args) 
	{
		VotingMachine vm = new VotingMachine();
		System.out.println(vm.getDemocratVotes());
		vm.voteForDemocrat();
		System.out.println(vm.getDemocratVotes());
		vm.voteForRepublican();
		System.out.println(vm.getRepublicanVotes());
		vm.clearMachine();
		System.out.println(vm.getRepublicanVotes());
		System.out.println(vm.getDemocratVotes());
	}

}
