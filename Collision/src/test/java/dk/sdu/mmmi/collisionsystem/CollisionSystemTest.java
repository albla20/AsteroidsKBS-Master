package dk.sdu.mmmi.collisionsystem;

import dk.sdu.mmmi.cbse.common.data.Entity;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CollisionSystemTest {

    @BeforeEach
    void setUp() {
    }


    @AfterEach
    void tearDown() {
    }


    @Test
    void isCollision() {

        Entity asteroid = new Entity();
        Entity bullet = new Entity();
        asteroid.setPolygonCoordinates(20, 0, 14, 14, 0, 20, -14, 14, -20, 0, -14, -14, 0, -20, 14, -14);
        bullet.setPolygonCoordinates(1, -1, 1, 1, -1, 1, -1, -1);

        asteroid.setX(10);
        asteroid.setY(10);
        bullet.setX(15);
        bullet.setY(15);

        CollisionSystem collisionSystem = new CollisionSystem();

        assertTrue(collisionSystem.isCollision(asteroid, bullet));
    }
    @Test
    void isNotCollision() {

        Entity asteroid = new Entity();
        Entity bullet = new Entity();
        asteroid.setPolygonCoordinates(20, 0, 14, 14, 0, 20, -14, 14, -20, 0, -14, -14, 0, -20, 14, -14);
        bullet.setPolygonCoordinates(1, -1, 1, 1, -1, 1, -1, -1);

        asteroid.setX(10);
        asteroid.setY(10);
        bullet.setX(150);
        bullet.setY(150);

        CollisionSystem collisionSystem = new CollisionSystem();

        assertFalse(collisionSystem.isCollision(asteroid, bullet));
    }



}