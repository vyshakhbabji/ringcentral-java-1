package com.ringcentral.paths;

import com.ringcentral.Path;
import com.ringcentral.PathSegment;
import com.ringcentral.RestClient;

public class End extends Path {
    public End(RestClient restClient, PathSegment parent, String id) {
        this.restClient = restClient;
        pathSegment = new PathSegment(parent, "end", id);
    }
}
