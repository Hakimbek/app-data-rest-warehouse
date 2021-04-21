package uz.pdp.appdatarestwarehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appdatarestwarehouse.entity.Attachment;
import uz.pdp.appdatarestwarehouse.projection.AttachmentProjection;

@RepositoryRestResource(path = "attachment", excerptProjection = AttachmentProjection.class)
public interface AttachmentRepository extends JpaRepository<Attachment, Integer> {
}
