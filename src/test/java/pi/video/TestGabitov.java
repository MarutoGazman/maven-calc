package pi.video;
/*����������� ����������. JUnit - ��� ����������, �����������
 * ��������� ��������� ������������ Java ����������. ����� Assert 
 * �������� ����� �����������, ������� ��������� ������� ������������. */
import static org.junit.Assert.*;
import org.junit.Test;

public class TestGabitov {
	/*���������� ������� ����������� �������� ��������*/
	double[] testValues1 = {1920, 1080, 24, 50, 52, 16, 44100};
	
	/*��������� @Test ��������� JUnit, ��� ����� �������� �������� �������*/
	@Test
	public void testToCalculate1() {
		/* ������� assertTrue ���������� ��������� (true ��� false) ��������� ��������
		 * ����������� �������� �������� � ����� toCalculate, ������� ������������
		 * ���������� ������ � ����������������� ����
		 * ����� ���� ��������� ������������ � ��������� ���������*/
		assertTrue(Calculate.toCalculate(testValues1) == 1297.4431738257408);
	}
	
}