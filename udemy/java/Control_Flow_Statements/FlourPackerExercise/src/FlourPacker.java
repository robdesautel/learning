public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal){
        int totalKilos = 0;
        if((bigCount < 0) || (smallCount < 0) || (goal < 0)){
            return false;
        }
        int big=bigCount*5;
        if(big+smallCount<goal) {

            return false;
        }
        if (big <= goal) {

            return true;
        }

        return smallCount >= (goal % 5);
    }
}


//        if(big+smallCount<goal) {
//
//            return false;
//        }
