package enumExam;

public class EnumExam {
	public static final String MALE = "MALE";
	public static final String FEMALE = "FEMALE";
	// static�� instance�� �����ص� ������ ���� main method�� ���ư� �� �ְ� �Ѵ�. Final�̶�, ���̻� ���̴� ������ �ٸ� ���� �� �ް��Ѵ�
	// constants���� �������� �׻� all caps�̴�
	public static void main (String[] args) {
		String gender1;
		// String data type (���ڿ�)���� gender1�̶�� ���� �Ѱ��� ����
		gender1 = EnumExam.MALE;
		gender1 = EnumExam.FEMALE;
		// gender1�̶�� ���ڿ� ���� �ӿ� MALE, FEMALE�̶�� ������ �־���
		// MALE, FEMALE�� static�� ���̴� ����������� Ŭ���� ������ (Ŭ������.Ŭ���� ������)����
		gender1 = "boy";
		// ������ �Ϲ� string �������� ���ϴ� MALE, FEMALE ���� ���� �ٸ� "boy" ���� ������ ������ ������
		
		Gender gender2;
		// Enum �������� data type���� ���� �� �ִ�
		gender2 = Gender.MALE;
		gender2 = Gender.FEMALE;
		// gender2 = "boy";
		// enum�� ���� ���ϴ� ���� ���⿡ ��ó�� "boy" ���� �ٸ� ���� �� ��� ������ ����
		
	}
	enum Gender {
			MALE, FEMALE;
	}
	// �׷��⿡ enum ������ data type�� ���δ�
	// ���� ����� enum ������ {��1, ��2;} �����̴�
}
