package com.github.lonniecoffman.hogwartsartifactsonline.artifact.dto;

import com.github.lonniecoffman.hogwartsartifactsonline.wizard.dto.WizardDto;

public record ArtifactDto(String id,
                          String name,
                          String description,
                          String imageUrl,
                          WizardDto owner) {
}
