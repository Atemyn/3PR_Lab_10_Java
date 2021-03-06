import java.util.Scanner;
import java.util.ArrayList;
import myClasses.Facade;
import myClasses.Building;
import myClasses.HelpClass;

public class PR_Lab_10_Java{
	public static void main(String[] args){
		/* ����� � ��������ࠬ� �����. */
		Building firstBuilding = new Building();
		Building secondBuilding = new Building();

		System.out.println("�ணࠬ�� �� ᮧ����� ������.\n�� ࠧ���� ����� �������� � �����.\n");
		System.out.println("����� � ��������ࠬ� �����: ");

		firstBuilding.inputBuilding();
		secondBuilding.initBuilding();

		firstBuilding.addToBuilding(secondBuilding);

		firstBuilding.addFloors();
		firstBuilding.removeFloors();
		/*............................................*/
		
		/* ���᮪ ��ꥪ⮢. */
		int amount = 2;
		ArrayList<Building> firstDynamicArray = new ArrayList<>();
		Building helpBuilding = new Building();

		System.out.println("\n���᮪ ��ꥪ⮢: ");

		firstDynamicArray.add(new Building());
		firstDynamicArray.get(0).inputBuilding();
		firstDynamicArray.add(new Building());
		firstDynamicArray.get(1).initBuilding();
		firstDynamicArray.get(0).addToBuilding(firstDynamicArray.get(1));
		/*...............................*/
		
		/* ���ᨢ ��ꥪ⮢. */
		Building[] firstArrayOfDyn = new Building[amount];
		Building[] secondArrayOfDyn = new Building[amount];
		for (int i = 0; i < amount; i++)
		{
			firstArrayOfDyn[i] = new Building();
			secondArrayOfDyn[i] = new Building();
		}

		System.out.println("\n���ᨢ ��ꥪ⮢: ");

		firstArrayOfDyn[0].inputBuilding();
		secondArrayOfDyn[1].initBuilding();

		firstArrayOfDyn[0].addToBuilding(secondArrayOfDyn[1]);
		/*..............................*/
		
		/* ���� �㭪樨 ���樠樨. */
		Building building = new Building();
		System.out.println("\n���� �㭪樨 ���樠樨: ");

		building.inputBuilding();

		building.openWindowsOnFacade();
		building.closeWindowsOnFacade();
		/*..........................*/	
				
		/* ������ ���祭�� � ������饩 �窮� �१ �ᯮ����⥫�� �����. */
		System.out.println("\n������ ���祭�� � ������饩 �窮� �१ �ᯮ����⥫�� �����: ");
		building = new Building();
		HelpClass h = new HelpClass();
		
		building.inputBuilding();
		building.returnStabilityFactor(h);
		System.out.println("���祭�� 䠪�� �⠡��쭮�� ������� ������: " + h.field);
		/*................................................................*/	
				
		/* �஢�ઠ �ᯮ�짮����� this � �㭪樨 AddToBuilding(). */
		System.out.println("\n�஢�ઠ �ᯮ�짮����� this � �㭪樨 AddToBuilding(): ");
		building = new Building();
		
		building.inputBuilding();
		
		building.addToBuilding(building);
		/*........................................................*/
		
		/* �ᯮ�짮����� ����᪮�� ��⮤� � ��������� ����ᥪ��� ����. */
		System.out.println("\n�ᯮ�짮����� ����᪮�� ��⮤� � ��������� ����ᥪ��� ����: ");
		Building.companyName = "�������";
		System.out.println("\n��饥 ������⢮ �����-���� ����஥���� �⮩ ��������� ������: " + Building.getCountOfBuildings());
		building.getBuilding();
		
		/* �ᯮ�짮����� ��������஢ */
		System.out.println("\n�ᯮ�짮����� ��������஢: ");
		Building b1 = new Building();
		Building b2 = new Building(5);
		Building b3 = new Building("��᭮� ������", 5, 1, 2, 3, 5, 3);
		
		/* ���樠������ ���ᨢ�. */
		Building mB[] = new Building[5];
		int i;
		for(i = 0; i < 5; i++)
		{
			mB[i] = new Building(i);
		}
		
		b1.getBuilding();
		b2.getBuilding();
		b3.getBuilding();
	}
}
