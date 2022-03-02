package collection.arraylist;

import collection.Member;

public class MemberArrayListTest {

	public static void main(String[] args) {

		MemberArrayList memberArrayList = new MemberArrayList();
		
		Member memberAlice = new Member(101, "Alice");
		Member memberBob = new Member(102, "Bob");
		Member memberCarol = new Member(103, "Carol");
		
		memberArrayList.addMember(memberAlice);
		memberArrayList.addMember(memberBob);
		memberArrayList.addMember(memberCarol);
		
		memberArrayList.showAll();
	}

}
