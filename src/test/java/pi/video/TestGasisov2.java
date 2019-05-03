package pi.video;
/*����������� ����������. JUnit - ��� ����������, �����������
 * ��������� ��������� ������������ Java ����������. ����� Assert 
 * �������� ����� �����������, ������� ��������� ������� ������������. */
import static org.junit.Assert.*;
import org.junit.Test;

public class TestGasisov2 {
	/*���������� ������� ����������� �������� ��������*/
	double[] testValues2 = {1920, 1080, 24, 50, 160, 16, 44100};
	
	/*��������� @Test ��������� JUnit, ��� ����� �������� �������� �������*/

	@Test
	public void testToCalculate2() {
		/* ������� assertTrue ���������� ��������� (true ��� false) ��������� ��������
		 * ����������� �������� �������� � ����� toCalculate, ������� ������������
		 * ���������� ������ � ����������������� ����
		 * ����� ���� ��������� ������������ � ��������� ���������*/
		assertTrue(Calculate.toCalculate(testValues2) == 3992.132842540741);
	}
}
