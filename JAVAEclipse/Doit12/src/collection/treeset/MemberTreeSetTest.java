package collection.treeset;

import collection.Member;

public class MemberTreeSetTest {

	public static void main(String[] args) {

		MemberTreeSet memberHashSet = new MemberTreeSet();
		
		Member member01 = new Member(101, "Alice");
		Member member02 = new Member(102, "Bob");
		Member member03 = new Member(103, "Caol");
		
		memberHashSet.addMember(member01);
		memberHashSet.addMember(member02);
		memberHashSet.addMember(member03);
		
		memberHashSet.showAll();
		
	}

}
