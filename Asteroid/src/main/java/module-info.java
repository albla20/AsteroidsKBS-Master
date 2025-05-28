import dk.sdu.mmmi.asteroidsystem.AsteroidSystem;
import dk.sdu.mmmi.asteroidsystem.AsteroidPlugin;
import dk.sdu.mmmi.cbse.common.services.IEntityProcessingService;
import dk.sdu.mmmi.cbse.common.services.IGamePluginService;

module Asteroid {
    requires Common;
    provides IGamePluginService with AsteroidPlugin;
    provides IEntityProcessingService with AsteroidSystem;
}

