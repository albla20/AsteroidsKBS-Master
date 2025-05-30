import dk.sdu.mmmi.cbse.common.services.IEntityProcessingService;
import dk.sdu.mmmi.collisionsystem.CollisionSystem;

module Collision {
    requires Common;
    requires CommonBullet;
    requires Asteroid;
    provides IEntityProcessingService with CollisionSystem;
}