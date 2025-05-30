
import dk.sdu.mmmi.cbse.common.services.IEntityProcessingService;
import dk.sdu.mmmi.cbse.common.services.IGamePluginService;
import dk.sdu.mmmi.enemysystem.EnemySystem;
import dk.sdu.mmmi.enemysystem.EnemyPlugin;


module Enemy {
    requires Common;
    requires CommonBullet;   
    uses dk.sdu.mmmi.cbse.common.bullet.BulletSPI;
    provides IGamePluginService with EnemyPlugin;
    provides IEntityProcessingService with EnemySystem;
}
