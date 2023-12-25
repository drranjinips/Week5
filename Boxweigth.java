package morePracticalExamples;

public class Boxweigth extends Box {
	int weight;// weight of box
	Boxweigth(int w, int h, int d, int m){
		width = w;
		height =h;
		length=d;
		weight=m;
		//We have repeated the codes in Box and and also in Boxweight. To avoid repetition we can use
		super(w,h,d);
		weight=m;
	}
	
}

	

