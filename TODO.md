
### **Core Framework Classes**
1. **Game**
    - The main class to initialize and control the game loop.
    - Manages the game's overall state (e.g., running, paused, menu).
    - Example Methods: `start()`, `stop()`, `update()`, `render()`, `main(String[] args)`.

2. **GameLoop**
    - Encapsulates the game loop logic with a consistent frame rate.
    - Example Methods: `run()`, `calculateDeltaTime()`.

---

### **Graphics and Rendering**
3. **Renderer**
    - Handles drawing objects to the screen.
    - Example Methods: `drawSprite()`, `drawText()`, `clearScreen()`.

4. **Sprite**
    - Represents a graphical asset or animation for objects.
    - Example Fields: `image`, `x`, `y`, `width`, `height`.

5. **TextureManager**
    - Manages loading, caching, and reusing textures or images.
    - Example Methods: `loadTexture(String path)`, `getTexture(String id)`.

---

### **Game Objects and Entities**
6. **GameObject**
    - A base class for all objects in the game.
    - Example Fields: `position`, `velocity`, `dimensions`, `sprite`.
    - Example Methods: `update()`, `render()`.

7. **Player** (extends `GameObject`)
    - Represents the player character with unique attributes.
    - Example Fields: `health`, `score`, `abilities`.
    - Example Methods: `move()`, `jump()`, `attack()`.

8. **Enemy** (extends `GameObject`)
    - Represents enemies or non-playable characters (NPCs).
    - Example Methods: `followPlayer()`, `patrol()`, `attackPlayer()`.

9. **Projectile** (extends `GameObject`)
    - Represents projectiles like bullets or missiles.
    - Example Fields: `damage`, `speed`.
    - Example Methods: `move()`, `onCollision()`.

10. **Item** (extends `GameObject`)
    - Represents collectible or interactable items (e.g., coins, power-ups).
    - Example Fields: `type`, `effect`.
    - Example Methods: `onPickup(Player player)`.

---

### **Physics and Collision**
11. **PhysicsEngine**
    - Handles physics simulations, like gravity or collision detection.
    - Example Methods: `applyForce(GameObject obj, Vector force)`, `resolveCollision(GameObject a, GameObject b)`.

12. **CollisionManager**
    - Detects and handles collisions between objects.
    - Example Methods: `checkCollision(GameObject a, GameObject b)`, `handleCollision()`.

---

### **Input and Controls**
13. **InputManager**
    - Handles keyboard, mouse, or controller inputs.
    - Example Methods: `isKeyPressed(int keyCode)`, `getMousePosition()`.

---

### **Audio**
14. **AudioManager**
    - Manages sound effects and background music.
    - Example Methods: `playSound(String id)`, `stopSound(String id)`, `setVolume(float volume)`.

---

### **Levels and Scenes**
15. **Level**
    - Represents a specific level or map in the game.
    - Example Fields: `layout`, `objectList`.
    - Example Methods: `load()`, `unload()`.

16. **Scene**
    - Represents game states like menu, gameplay, or game over.
    - Example Methods: `enter()`, `exit()`, `update()`, `render()`.

---

### **Utility**
17. **Timer**
    - Utility for managing timed events.
    - Example Methods: `start()`, `reset()`, `isExpired()`.

18. **Vector**
    - Represents 2D or 3D mathematical vectors for positions, velocities, etc.
    - Example Fields: `x`, `y`, `z`.
    - Example Methods: `add(Vector v)`, `subtract(Vector v)`, `magnitude()`.

19. **ConfigurationManager**
    - Loads and manages configuration settings (e.g., resolution, key bindings).
    - Example Methods: `loadConfig(String filePath)`, `getSetting(String key)`.

20. **Logger**
    - Logs game events or debugging information.
    - Example Methods: `logInfo(String message)`, `logError(String message)`.

