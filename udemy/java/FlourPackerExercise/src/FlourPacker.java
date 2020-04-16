public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal){
        int totalKilos = 0;
        int remainingBigCount = 0;
        if((bigCount < 0) || (smallCount < 0)){
            return false;
        }
        while(bigCount > 0){
            totalKilos += 5;
            bigCount --;
        }
        while (smallCount > 0){
            totalKilos++;
            smallCount--;
        }
        return totalKilos >= goal;
    }
}
