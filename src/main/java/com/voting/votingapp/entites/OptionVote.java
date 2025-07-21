package com.voting.votingapp.entites;

import jakarta.persistence.Embeddable;

@Embeddable
public class OptionVote {
    private String optionText;
    private Long voteCount = 0L;

    public String getOptionText() {
        return optionText;
    }

    public void setOptionText(String optionText) {
        this.optionText = optionText;
    }

    public Long getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(Long voteCount) {
        this.voteCount = voteCount;
    }
}
