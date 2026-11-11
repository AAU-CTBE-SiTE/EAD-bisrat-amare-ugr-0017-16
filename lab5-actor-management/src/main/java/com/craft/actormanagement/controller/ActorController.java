package com.craft.actormanagement.controller;

import com.craft.actormanagement.model.Actor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@RestController
@RequestMapping("/api/actors")
public class ActorController {

    private final List<Actor> actors = new ArrayList<>();

    private final AtomicInteger nextId = new AtomicInteger(4);

    public ActorController() {
        actors.add(new Actor(1, "Tom Hanks", "Forrest Gump"));
        actors.add(new Actor(2, "Leonardo DiCaprio", "Inception"));
        actors.add(new Actor(3, "Morgan Freeman", "The Shawshank Redemption"));
    }

    // GET: Retrieve all actors
    @GetMapping
    public List<Actor> getAllActors() {
        return actors;
    }

    // GET: Retrieve an actor by ID
    @GetMapping("/{id}")
    public ResponseEntity<Actor> getActorById(@PathVariable int id) {

        for (Actor actor : actors) {
            if (actor.getId() == id) {
                return ResponseEntity.ok(actor);
            }
        }

        return ResponseEntity.notFound().build();
    }

    // POST: Add a new actor
    @PostMapping
    public ResponseEntity<Actor> addActor(@RequestBody Actor actor) {

        actor.setId(nextId.getAndIncrement());
        actors.add(actor);

        return ResponseEntity.status(HttpStatus.CREATED).body(actor);
    }

    // PUT: Replace an existing actor
    @PutMapping("/{id}")
    public ResponseEntity<Actor> updateActor(
            @PathVariable int id,
            @RequestBody Actor updatedActor) {

        for (Actor actor : actors) {
            if (actor.getId() == id) {

                actor.setName(updatedActor.getName());
                actor.setMovie(updatedActor.getMovie());

                return ResponseEntity.ok(actor);
            }
        }

        return ResponseEntity.notFound().build();
    }

    // PATCH: Update selected actor fields
    @PatchMapping("/{id}")
    public ResponseEntity<Actor> partiallyUpdateActor(
            @PathVariable int id,
            @RequestBody Actor updatedActor) {

        for (Actor actor : actors) {
            if (actor.getId() == id) {

                if (updatedActor.getName() != null) {
                    actor.setName(updatedActor.getName());
                }

                if (updatedActor.getMovie() != null) {
                    actor.setMovie(updatedActor.getMovie());
                }

                return ResponseEntity.ok(actor);
            }
        }

        return ResponseEntity.notFound().build();
    }

    // DELETE: Delete an actor
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteActor(@PathVariable int id) {

        for (Actor actor : actors) {
            if (actor.getId() == id) {
                actors.remove(actor);
                return ResponseEntity.noContent().build();
            }
        }

        return ResponseEntity.notFound().build();
    }
}