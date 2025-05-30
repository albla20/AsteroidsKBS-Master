
import dk.sdu.mmmi.cbse.EntityProcessor;
import dk.sdu.mmmi.cbse.PlayerSystem;
import dk.sdu.mmmi.cbse.PlayerPlugin;
import dk.sdu.mmmi.cbse.common.services.IEntityProcessingService;
import dk.sdu.mmmi.cbse.common.services.IGamePluginService;

module Player {
    requires Common;
    requires CommonBullet;   
    uses dk.sdu.mmmi.cbse.common.bullet.BulletSPI;
    provides IGamePluginService with PlayerPlugin;
    provides IEntityProcessingService with PlayerSystem, EntityProcessor;
}
