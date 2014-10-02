
public class triangle {
	int CheckTriangle(int a, int b, int c)
	{
		// ret 0 - khong phai tam giac
		// ret 1 - tam giac thuong
		// ret 2 - tam giac deu
		// ret 3 - tam giac can
		// ret 4 - tam giac vuong
		if (((a + b) > c) && ((b + c) > a) && ((c + a) > b))
		{
			if ((a == b) && ( b == c))
				return 2;
			if ((a == b) || (b == c) || (c == a))
				return 3;
			if ((a*a + b*b == c*c) || (a*a + c*c == b*b) || (b*b + c*c == a*a))
				return 4;
			return 1;
		}
		else
			return 0;
		
	}
	
}
