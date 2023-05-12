import java.io.*;
import java.lang.Math;

public class TestList
{
	public static void main(String[] args)
	{
		double b0 = 0.0;
		double b1 = 0.0;
		double x = 0.0;
		double y = 0.0;
		double xmean = 0.0;
		double ymean = 0.0;
		double xsize = 0.0;
		double ysize= 0.0;
		double temp = new Double(0.0);
		
		QueueAsMyLinkedList<Double> xvalues =  new QueueAsMyLinkedList<Double>();
		QueueAsMyLinkedList<Double> yvalues = new QueueAsMyLinkedList<Double>();
		
		xvalues.enqueue(new Double(1.00));
		xvalues.enqueue(new Double(2.00));
		xvalues.enqueue(new Double(5.00));
		
		System.out.println("x values : "+ xvalues+ " ");
		
		
		yvalues.enqueue(new Double(2.00));
		yvalues.enqueue(new Double(4.00));
		yvalues.enqueue(new Double(4.00));
		
		
		
		
		System.out.println("y values : "+ yvalues+ " ");
		double xsum =0.0;
		double ysum=0.0;
		double term1=0.0;
		double term2 =0.0;
		double term3=0.0;
		double term4 =0.0;
		
		
		while(!xvalues.isEmpty() && !yvalues.isEmpty())
		{
			
			temp = xvalues.dequeue();
			x = temp;
			
			temp = yvalues.dequeue();
			y = temp;
			
			xsum +=x;
			ysum +=y;
			
			xmean = xsum/3.0;
			ymean = ysum/3.0;
			
			term1 = x-xmean;
			term2 = y-ymean;
			
			term3 += (term1)*(term2);
			
			term4 += (Math.pow((x-xmean),2));
			
			b1 = term3/term4;
			b0 = ymean - b1*xmean;
			
			
		}
		
		System.out.println("x mean "+ xmean);
		System.out.println("y mean "+ ymean);
		System.out.println("term 3 "+term3);
		System.out.println("term 4 "+term4);
		System.out.println("b1 "+b1);
		System.out.println("b0 "+b0);
		System.out.println("\nRegressoin Line of  a given data is:");
		System.out.println("y = "+b0+ " x"+b1);
		
			
		
	}

}
