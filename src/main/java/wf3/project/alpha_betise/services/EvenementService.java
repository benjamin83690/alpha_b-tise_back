package wf3.project.alpha_betise.services;

import java.util.List;

import wf3.project.alpha_betise.dtos.EvenementDto;
import wf3.project.alpha_betise.entities.Evenement;

public interface EvenementService {

	public List<EvenementDto> getAll();

	public Evenement get(Long id) throws Exception;

	public Evenement post(Evenement evenement);

	public void delete(Long id);

	public List<EvenementDto> getNextEvent();

	public List<EvenementDto> getPastEvent();
}
