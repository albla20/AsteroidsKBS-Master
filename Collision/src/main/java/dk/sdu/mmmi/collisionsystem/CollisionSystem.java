package dk.sdu.mmmi.collisionsystem;


import dk.sdu.mmmi.cbse.common.data.Entity;
import dk.sdu.mmmi.cbse.common.data.GameData;
import dk.sdu.mmmi.cbse.common.data.World;
import dk.sdu.mmmi.cbse.common.data.entityParts.LifePart;
import dk.sdu.mmmi.cbse.common.services.IPostEntityProcessingService;


import static java.lang.Math.sqrt;

public class CollisionSystem implements IPostEntityProcessingService {


    @Override
    public void process(GameData gameData, World world) {
        for (Entity entity : world.getEntities()) {
            for (Entity entity1 : world.getEntities()) {
                if (isCollision(entity, entity1) && entity.getClass() != entity1.getClass()) {
                    LifePart lifePart = entity.getPart(LifePart.class);
                    LifePart lifePart1 = entity1.getPart(LifePart.class);
                    lifePart.setDmgTaken(lifePart1.getDmg());
                    lifePart1.setDmgTaken(lifePart.getDmg());
                }
            }
        }
    }


    public boolean isCollision(Entity e1, Entity e2) {
        double x1 = e1.getX();
        double y1 = e1.getY();

        double x2 = e2.getX();
        double y2 = e2.getY();

        double result = sqrt(((x1 - x2) * (x1 - x2)) + ((y1 - y2) * (y1 - y2)));
        double e1Width = e1.getWidth() / 2;
        double e2Width = e2.getWidth() / 2;

        if (result < e1Width + e2Width) {
            return true;
        }

        return false;
    }


}

