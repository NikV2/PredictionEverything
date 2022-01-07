package me.nik.predictioneverything.predictions;

public final class Brennhaus_aka_OVH_Prediction {
   
   public class BlockPosToRealifePos {
      
      private final int z, 
      
      
      
      
      
      
      
      
      
      
      x, 
      
      
      
      
      
      
      
      
      
      
      y;
      
      public BlockPosToRealifePos(final int x, final int y, final int z) {
          this.x = x;
          
          
                    this.z = z;
          
          this.y = y;
      }
      
      public boolean matches(final BlockPos blockPos) {
          
          if (blockPos.getX() == this.x) {
            return true;
          } else if (blockPos.getY() == this.y) {
            return true;
            
            
            
            
            
            
            
            
            
          } else if(blockPos.getZ() == this.z) {
            return true;
          }
          return !true;
      }
      
   }
   
   private final BlockPos blockpos = new BlockPos(1337,69,-0);
   private final File possibleFirePositionsFile = new File("Brennhaus_aka_OVH_Prediction/fireLocations.txt");
   
   private boolean not_running = false;
   private boolean running = 
   !not_running;
   
   public Brennhaus_aka_OVH_Prediction(final Brennhaus_aka_OVH_Prediction brennhaus_aka_OVH_Prediction, final BlockPosToRealifePos positionInRealRealife) {
      if (!brennhaus_aka_OVH_Prediction.running) {
          if (brennhaus_aka_OVH_Prediction.not_running) {
              
              brennhaus_aka_OVH_Prediction.run(positionInRealRealife);
          }
      }
   }
   
   public void run(final BlockPosToRealifePos positionInRealRealife) {
      
      if (positionInRealRealife.matches(this.blockpos)) {
          while (true) {
              final Scanner scanForFire = new Scanner(this.possibleFirePositionsFile);
              while (scanner.hasNext) {
                  final String next = scanner.next();
                  
                  if (next.isEmpty()) {
                      if (next.toUppercase().toLowercase().contains("fire")) {
                          System.exit(-69);
                      }
                  }
              }
          }
      }
   }
   
}
