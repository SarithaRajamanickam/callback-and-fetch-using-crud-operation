package com.example.country;


import java.util.List;
import com.example.country.Country;
import com.example.country.CountryRepository;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RestController;



// import org.springframework.http.HttpStatus;

@RestController
@RequestMapping("/country")
public class CountryController {
  @Autowired
  private CountryRepository repo;
  
  @RequestMapping(method = RequestMethod.GET)
  public List<Country> findItems() {
    return repo.findAll();
  }

  //  @RequestMapping(value = "/{id}",method = RequestMethod.GET)
  // public Country findone(@PathVariable Integer id) {
  //   return  repo.findAllById(id);
  // }
   @RequestMapping(method = RequestMethod.POST)
  public Country addItem(@RequestBody Country country) {
    country.SetId(null);

    return repo.saveAndFlush(country);
  }
   @RequestMapping(value = "/{id}", method = RequestMethod.POST)
  public Country updateItem(@RequestBody Country updatedItem, @PathVariable Integer id) {
    updatedItem.SetId(id);
    return repo.saveAndFlush(updatedItem);
  }

  @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
  public void deleteItem(@PathVariable Integer id) {
    repo.deleteById(id);
  }
 
 
//  @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)


// public void deleteItem(@PathVariable Integer id) {
//   try {
//     repo.deleteById(id);
//   } catch (Exception e) {
//     System.out.println(e);
//   }  

  }
//  public void deleteItem(@PathVariable Integer id) {
  // @DeleteMapping("/{id}")
  // public void deleteStudent(@PathVariable Integer id) {
  
  //   if (HttpStatus.INTERNAL_SERVER_ERROR != null) {
  //       throw new StudentNotFoundException(null);}
  //     else{
  //         repo.deleteById(id);
  //     }
  //       }
  
//   @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
//  public void deleteItem(@PathVariable Integer id) {
// //   // if(  repo.deleteById(id)
// //   //   .orElseThrow(
// // 	// 			() -> new StudentNotFoundException("error"))
// // @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR,id)
// //       throw new StudentNotFoundException("error");  

    
//  }

// @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
// {
//   try{
//     repo.deleteById(id);
//   }

	// // public ResponseEntity<?> deleteUser() {
	// // 	System.out.printf("Fetching & Deleting User with id {}", id);

	// // 	Optional<Country> user = repo.findById(id)
	// 	if (user == null) {
	// 		logger.error("Unable to delete. User with id {} not found.", id);
	// 		return new ResponseEntity(new CustomErrorType("Unable to delete. User with id " + id + " not found."),
	// 				HttpStatus.NOT_FOUND);
	// 	}
	// 	userService.deleteUserById(id);
	// 	return new ResponseEntity<User>(HttpStatus.NO_CONTENT);
	// }

