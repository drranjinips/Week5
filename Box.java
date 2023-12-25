package morePracticalExamples;

public class Box {
	int  width;
	int  height;
	int length;
    public	Box(int w, int h, int d){
		width = w;
		height =h;
		length=d;
    }
    int volume(){
     return width*	height*length;
     
    }
}
