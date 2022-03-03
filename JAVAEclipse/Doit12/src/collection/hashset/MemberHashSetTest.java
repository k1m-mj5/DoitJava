package collection.hashset;

import collection.Member;

public class MemberHashSetTest {

	public static void main(String[] args) {

		MemberHashSet memberHashSet = new MemberHashSet();
		
		Member member01 = new Member(101, "Alice");
		Member member02 = new Member(102, "Bob");
		Member member03 = new Member(103, "Caol");
		
		memberHashSet.addMember(member01);
		memberHashSet.addMember(member02);
		memberHashSet.addMember(member03);
		
		memberHashSet.showAll();
		Member member04 = new Member(104, "Dave");
		memberHashSet.addMember(member04);
		memberHashSet.showAll();
	}

}
