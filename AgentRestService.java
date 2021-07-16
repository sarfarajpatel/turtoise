package com.masa.pts.api.agent.service;

import com.masa.pts.api.agent.model.AgentReducedViewDTO;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgentRestService {

    private final AgentV1Service agentV1Service;

    public AgentRestService(AgentV1Service agentV1Service) {
        this.agentV1Service = agentV1Service;
    }

    public List<AgentReducedViewDTO> getAgentReducedInfo(String agentFullName, Integer agentId, Pageable pageable) {
        return agentV1Service.getAgentReducedView(agentFullName, agentId, pageable).getContent();
    }
}
