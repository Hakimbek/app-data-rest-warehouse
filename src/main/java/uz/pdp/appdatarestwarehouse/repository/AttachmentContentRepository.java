package uz.pdp.appdatarestwarehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appdatarestwarehouse.entity.AttachmentContent;
import uz.pdp.appdatarestwarehouse.projection.AttachmentContentProjection;

import java.util.Optional;

@RepositoryRestResource(path = "attachmentContent", excerptProjection = AttachmentContentProjection.class)
public interface AttachmentContentRepository extends JpaRepository<AttachmentContent, Integer> {
    Optional<AttachmentContent> findByAttachmentId(Integer attachment_id);
}
