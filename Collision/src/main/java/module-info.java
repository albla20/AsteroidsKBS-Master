import dk.sdu.mmmi.cbse.common.services.IPostEntityProcessingService;
import dk.sdu.mmmi.collisionsystem.CollisionSystem;

module Collision {
    requires Common;
    requires CommonBullet;
    requires Asteroid;
    provides IPostEntityProcessingService with CollisionSystem;
}