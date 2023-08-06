package r04.c10;

public class Main {
    public static void main(String[] args) {
        WampireNumber(2187);
    }

    public static void WampireNumber(int val){
        if(val > 1000 && val < 10000) {
            System.out.println(val);
            int[] Arr = new int[4];
            Arr[0] = val % 10;
            Arr[1] = (val % 100 - val % 10) / 10;
            Arr[2] = (val % 1000 - val % 100) / 100;
            Arr[3] = (val % 10000 - val % 1000) / 1000;
            System.out.println(Arr[0]);
            System.out.println(Arr[1]);
            System.out.println(Arr[2]);
            System.out.println(Arr[3]);
            //multiply one of the numbers by 10 and then add the other one to it
            //do it for both 'pairs' for every comibnation.
            outer:
            for(int i = 0; i < Arr.length; i++){
                for(int j = 0; j < Arr.length; j++){
                    if(i == j){
                        continue;
                    }
                    switch(i){
                        case 0:{
                            int tmp1 = Arr[i] * 10 + Arr[j];
                            switch(j){
                                case 1:{
                                    int tmp2 = Arr[2] * 10 + Arr[3];
                                    int tmp3 = Arr[3] * 10 + Arr[2];
                                    if(tmp1 * tmp2 == val){
                                        System.out.println("Vampire number values: " + tmp1 + " " + tmp2);
                                        break outer;
                                    } else if (tmp1 * tmp3 == val) {
                                        System.out.println("Vampire number values: " + tmp1 + " " + tmp3);
                                        break outer;
                                    }
                                    break;
                                }
                                case 2:{
                                    int tmp2 = Arr[1] * 10 + Arr[3];
                                    int tmp3 = Arr[3] * 10 + Arr[1];
                                    if(tmp1 * tmp2 == val){
                                        System.out.println("Vampire number values: " + tmp1 + " " + tmp2);
                                        break outer;
                                    } else if (tmp3 * tmp1 == val) {
                                        System.out.println("Vampire number values: " + tmp1 + " " + tmp3);
                                        break outer;
                                    }
                                    break;
                                }
                                case 3:{
                                    int tmp2 = Arr[2] * 10 + Arr[1];
                                    int tmp3 = Arr[1] * 10 + Arr[2];
                                    if(tmp1 * tmp2 == val){
                                        System.out.println("Vampire number values: " + tmp1 + " " + tmp2);
                                        break outer;
                                    } else if (tmp1 * tmp3 == val) {
                                        System.out.println("Vampire number values: " + tmp1 + " " + tmp3);
                                        break outer;
                                    }
                                    break;
                                }
                            }
                            break;
                        }
                        case 1:{
                            int tmp1 = Arr[i] * 10 + Arr[j];
                            switch(j){
                                case 0:{
                                    int tmp2 = Arr[2] * 10 + Arr[3];
                                    int tmp3 = Arr[3] * 10 + Arr[2];
                                    if(tmp1 * tmp2 == val){
                                        System.out.println("Vampire number values: " + tmp1 + " " + tmp2);
                                        break outer;
                                    } else if (tmp1 * tmp3 == val) {
                                        System.out.println("Vampire number values: " + tmp1 + " " + tmp3);
                                        break outer;
                                    }
                                    break;
                                }
                                case 2:{
                                    int tmp2 = Arr[0] * 10 + Arr[3];
                                    int tmp3 = Arr[3] * 10 + Arr[0];
                                    if(tmp1 * tmp2 == val){
                                        System.out.println("Vampire number values: " + tmp1 + " " + tmp2);
                                        break outer;
                                    } else if (tmp3 * tmp1 == val) {
                                        System.out.println("Vampire number values: " + tmp1 + " " + tmp3);
                                        break outer;
                                    }
                                    break;
                                }
                                case 3:{
                                    int tmp2 = Arr[2] * 10 + Arr[0];
                                    int tmp3 = Arr[0] * 10 + Arr[2];
                                    if(tmp1 * tmp2 == val){
                                        System.out.println("Vampire number values: " + tmp1 + " " + tmp2);
                                        break outer;
                                    } else if (tmp1 * tmp3 == val) {
                                        System.out.println("Vampire number values: " + tmp1 + " " + tmp3);
                                        break outer;
                                    }
                                    break;
                                }
                            }
                        }
                        case 2:{
                            int tmp1 = Arr[i] * 10 + Arr[j];
                            switch(j){
                                case 0:{
                                    int tmp2 = Arr[1] * 10 + Arr[3];
                                    int tmp3 = Arr[3] * 10 + Arr[1];
                                    if(tmp1 * tmp2 == val){
                                        System.out.println("Vampire number values: " + tmp1 + " " + tmp2);
                                        break outer;
                                    } else if (tmp1 * tmp3 == val) {
                                        System.out.println("Vampire number values: " + tmp1 + " " + tmp3);
                                        break outer;
                                    }
                                    break;
                                }
                                case 1:{
                                    int tmp2 = Arr[0] * 10 + Arr[3];
                                    int tmp3 = Arr[3] * 10 + Arr[0];
                                    if(tmp1 * tmp2 == val){
                                        System.out.println("Vampire number values: " + tmp1 + " " + tmp2);
                                        break outer;
                                    } else if (tmp3 * tmp1 == val) {
                                        System.out.println("Vampire number values: " + tmp1 + " " + tmp3);
                                        break outer;
                                    }
                                    break;
                                }
                                case 3:{
                                    int tmp2 = Arr[0] * 10 + Arr[1];
                                    int tmp3 = Arr[1] * 10 + Arr[0];
                                    if(tmp1 * tmp2 == val){
                                        System.out.println("Vampire number values: " + tmp1 + " " + tmp2);
                                        break outer;
                                    } else if (tmp1 * tmp3 == val) {
                                        System.out.println("Vampire number values: " + tmp1 + " " + tmp3);
                                        break outer;
                                    }
                                    break;
                                }
                            }
                        }
                        case 3:{
                            int tmp1 = Arr[i] * 10 + Arr[j];
                            switch(j){
                                case 0:{
                                    int tmp2 = Arr[1] * 10 + Arr[2];
                                    int tmp3 = Arr[2] * 10 + Arr[1];
                                    if(tmp1 * tmp2 == val){
                                        System.out.println("Vampire number values: " + tmp1 + " " + tmp2);
                                        break outer;
                                    } else if (tmp1 * tmp3 == val) {
                                        System.out.println("Vampire number values: " + tmp1 + " " + tmp3);
                                        break outer;
                                    }
                                    break;
                                }
                                case 1:{
                                    int tmp2 = Arr[0] * 10 + Arr[2];
                                    int tmp3 = Arr[2] * 10 + Arr[0];
                                    if(tmp1 * tmp2 == val){
                                        System.out.println("Vampire number values: " + tmp1 + " " + tmp2);
                                        break outer;
                                    } else if (tmp3 * tmp1 == val) {
                                        System.out.println("Vampire number values: " + tmp1 + " " + tmp3);
                                        break outer;
                                    }
                                    break;
                                }
                                case 2:{
                                    int tmp2 = Arr[0] * 10 + Arr[1];
                                    int tmp3 = Arr[1] * 10 + Arr[0];
                                    if(tmp1 * tmp2 == val){
                                        System.out.println("Vampire number values: " + tmp1 + " " + tmp2);
                                        break outer;
                                    } else if (tmp1 * tmp3 == val) {
                                        System.out.println("Vampire number values: " + tmp1 + " " + tmp3);
                                        break outer;
                                    }
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        else{
            System.out.println("fuck off ya twat");
        }
    }
}
