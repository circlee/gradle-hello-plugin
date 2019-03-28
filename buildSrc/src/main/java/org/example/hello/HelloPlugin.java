package org.example.hello;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class HelloPlugin implements Plugin<Project> {
    public void apply(Project project) {
        project.getTasks().create("hello", Hello.class, (task) -> { 
            task.setMessage("Hello");
            task.setRecipient("World");                                
        });
    }
}
