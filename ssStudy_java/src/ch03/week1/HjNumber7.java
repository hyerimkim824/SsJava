package ch03.week1;

public class HjNumber7{

    public static void main(String[] args) {
        
        //1-99 배열 생성
        int game[] = new int[100];
        
        for(int i=0;i<=game.length-1;i++) {
            game[i] = i;
        //    System.out.println(i);
        }
        
        for(int i=0;i<=game.length-1;i++) {
            String[] txtgame = new String[100];
            
            txtgame[i]= String.valueOf(game[i]);//int->String
            
            int count =0;
            String s = txtgame[i];
            char c1  = s.charAt(0);//첫번째 자릿수
            //첫번째 자릿수가 3,6,9를 포함하고 있는지의 여부
            if(c1=='3'||c1=='6'||c1=='9') {
            	count++;    //1번만 포함하면 count =1
            
                }
            //10 이상의 경우
            if(i>=10) {
            	//한번 더 3,6,9가 포함되는 지의 여부
            char c2 = s.charAt(1);
            if(c2=='3'||c2=='6'||c2=='9') { //10의자릿수에 한번 더 포함되면 count가 1 올라가서 2
            	count ++;   
            }};
            
            if(count == 1) {
                System.out.println(game[i] + ":" +"박수 한번");
            }else if(count==2) {
                System.out.println(game[i] + ":" + "박수 두번");
            }
            }
        
     
        }
    }


