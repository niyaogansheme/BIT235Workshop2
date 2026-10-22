public class SunEarthVolume {
    public static void main(String[] args) {
        final double pi = 3.14;
        double sunDiameter = 865000;
        double earthDiameter = 7600;

        double sunR = sunDiameter / 2;
        double earthR = earthDiameter / 2;

        double volumeSun = (4.0/3) * pi * Math.pow(sunR,3);
        double volumeEarth = (4.0/3) * pi * Math.pow(earthR,3);

        double ratio = volumeSun / volumeEarth;

        System.out.println("Volume of Earth (cubic miles): "+volumeEarth);
        System.out.println("Volume of Sun (cubic miles): "+volumeSun);
        System.out.println("Ratio of Sun volume to Earth volume = "+ratio);
    }
}
