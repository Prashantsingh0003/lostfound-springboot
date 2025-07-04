package com.smartfind.lostfound;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/items")
public class LostFoundController {
	
	// ----------- 7 FULL LENGTH RequestMappings -----------

    @RequestMapping(value = "/reportLost", method = RequestMethod.POST)
    public String reportLostItem() {
        return "Lost item has been reported successfully.";
    }

    @RequestMapping(value = "/reportFound", method = RequestMethod.POST)
    public String reportFoundItem() {
        return "Found item has been reported successfully.";
    }

    @RequestMapping(value = "/allLost", method = RequestMethod.GET)
    public String getAllLostItems() {
        return "List of all lost items.";
    }

    @RequestMapping(value = "/allFound", method = RequestMethod.GET)
    public String getAllFoundItems() {
        return "List of all found items.";
    }

    @RequestMapping(value = "/match", method = RequestMethod.GET)
    public String matchLostAndFound() {
        return "Matched lost and found items.";
    }

    @RequestMapping(value = "/deleteLost", method = RequestMethod.DELETE)
    public String deleteLostReport() {
        return "Lost report deleted.";
    }

    @RequestMapping(value = "/deleteFound", method = RequestMethod.DELETE)
    public String deleteFoundReport() {
        return "Found report deleted.";
    }

    // ----------- 8 SHORT-FORM Annotations -----------

    @GetMapping("/recentLost")
    public String recentLostItems() {
        return "Recently reported lost items.";
    }

    @GetMapping("/recentFound")
    public String recentFoundItems() {
        return "Recently reported found items.";
    }

    @PostMapping("/claim")
    public String claimItem() {
        return "Claim submitted for a found item.";
    }

    @PutMapping("/verifyClaim")
    public String verifyClaim() {
        return "Claim verification process started.";
    }

    @DeleteMapping("/cancelClaim")
    public String cancelClaim() {
        return "Claim has been cancelled.";
    }

    @PostMapping("/uploadImage")
    public String uploadItemImage() {
        return "Image uploaded for item.";
    }

    @PutMapping("/updateStatus")
    public String updateItemStatus() {
        return "Item status updated.";
    }

    @DeleteMapping("/removeImage")
    public String removeItemImage() {
        return "Item image removed.";
    }

}
