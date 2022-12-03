public class Signaling {
    int signaling;

    public Signaling(int signaling){
        {
          if(signaling == 0){
              System.out.println("Хозяева дома. Сигнализация отключена");
          }else if(signaling == 1){
            System.out.println("Хозяев нету. Сигнализация включена");
        }

        }
    }
}
