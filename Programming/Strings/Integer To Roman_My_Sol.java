public class Solution {
	public String intToRoman(int a) {
	    StringBuilder sb = new StringBuilder();
        while(a > 0){
            //approch is to just add requried char and decrement number
            if(a >= 1000){sb.append('M');a-=1000;}
            else if(a >= 900){sb.append("CM"); a-=900;}
            else if(a >= 500){sb.append('D');a-=500;}
            else if(a >= 400){sb.append("CD");a-=400;}
            else if(a >= 100){sb.append('C');a-=100;}
            else if(a >= 90){sb.append("XC");a-=90;}
            else if(a >= 50){sb.append('L');a-=50;}
            else if(a >= 40){sb.append("XL");a-=40;}
            else if(a >= 10){sb.append('X');a-=10;}
            else if(a >= 9){sb.append("IX");a-=9;}
            else if(a >= 5){sb.append('V');a-=5;}
            else if(a >= 4){sb.append("IV");a-=4;}
            else if(a >= 1){sb.append("I");a-=1;}
        }
        return sb.toString();
	}
}
