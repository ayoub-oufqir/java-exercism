public class Lasagna {
    final int ovenMinutes = 40;
    final int timeToPrepareALayer = 2;

    public int expectedMinutesInOven(){
        return ovenMinutes;
    }

    public int remainingMinutesInOven(int doneMinutes){
        return expectedMinutesInOven()-doneMinutes;
    }

    public int preparationTimeInMinutes(int layersPrepared){
        return layersPrepared*timeToPrepareALayer;
    }

    public int totalTimeInMinutes(int layersPrepared, int cookingTime){
        return preparationTimeInMinutes(layersPrepared) + cookingTime;
    }
}
