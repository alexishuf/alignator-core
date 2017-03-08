package br.ufsc.inf.lapesd.alignator.core.entity.loader;

import java.util.ArrayList;
import java.util.List;

public class SemanticResource {

    private String entity;
    private List<String> properties = new ArrayList<>();
    private List<UriTemplate> uriTemplates = new ArrayList<>();
    private ServiceDescription semanticMicroserviceDescription;
    
    public ServiceDescription getSemanticMicroserviceDescription() {
        return semanticMicroserviceDescription;
    }
    
    public void setSemanticMicroserviceDescription(ServiceDescription semanticMicroserviceDescription) {
        this.semanticMicroserviceDescription = semanticMicroserviceDescription;
    }

    public String getEntity() {
        return entity;
    }

    public void setEntity(String entity) {
        this.entity = entity;
    }

    public List<String> getProperties() {
        return properties;
    }

    public void setProperties(List<String> properties) {
        this.properties = properties;
    }

    public List<UriTemplate> getUriTemplates() {
        return uriTemplates;
    }

    public void setUriTemplates(List<UriTemplate> uriTemplates) {
        this.uriTemplates = uriTemplates;
    }

}
