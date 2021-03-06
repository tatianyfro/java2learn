package pt.c02oo.s08sobrecarga.s04tempo;

public class Horario {
   private int hora, minuto, segundo;
   
   public Horario() {
      this.hora = 0;
      this.minuto = 0;
      this.segundo = 0;
   }
   
   public Horario(int hora, int minuto, int segundo) {
      this.hora = hora;
      this.minuto = minuto;
      this.segundo = segundo;
   }
   
   public Horario(String horario) {
      this.hora = Integer.parseInt(horario.substring(0,2));
      this.minuto = Integer.parseInt(horario.substring(3,5));
      this.segundo = Integer.parseInt(horario.substring(6));
   }
   
   public void tick() {
      segundo++;
      if (segundo == 60) {
         minuto++;
         segundo = 0;
      }
      if (minuto == 60) {
         hora++;
         minuto = 0;
      }
      if (hora == 24) {
         hora = 0;
         minuto = 0;
         segundo = 0;
      }
   }
   
   public String toString() {
      return hora + ":" + minuto + ":" + segundo;
   }
}