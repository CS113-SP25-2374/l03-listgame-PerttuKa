package cs113.listGame.resources;

import cs113.listGame.gamecore.GameObject;

import java.util.ArrayList;

public class ResourceArrayList implements ResourceList {
    ArrayList<ResourceObject> resourceArray =  new ArrayList<>();
    @Override
    public void add(ResourceObject resource) {
        resourceArray.add(resource);
    }

    @Override
    public void remove(ResourceObject resource) {
        resourceArray.remove(resource);
    }

    @Override
    public void truncate(ResourceObject resource) {

    }

    @Override
    public void follow(GameObject leader) {

    }
}
