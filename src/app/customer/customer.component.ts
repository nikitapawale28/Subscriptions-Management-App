import { Component } from '@angular/core';
import { HttpClient, HttpErrorResponse } from '@angular/common/http';

@Component({
  selector: 'app-customer',
  templateUrl: './customer.component.html',
  styleUrls: ['./customer.component.scss']
})
export class CustomerComponent {
  constructor(private http: HttpClient) { }
  activeTab: string = 'Customer'; // Set the initial active tab
  showAddCustomerPopup = false;
  showAddPublicationPopup = false;
  activateTab(tabName: string) {
    this.activeTab = tabName;

  }
   ngOnInit() {
    // This method will be invoked when the "Customer" tab loads
    this.fetchCustomerDetails();
    this.fetchPublicationsDetails();
     this.fetchSubscriptionsDetails();

  }

  customers: { id_no: number; name: string; address: string; editable:boolean; showConfirm:boolean; }[] = [];
  publications: { name: string; pub_type: string; editable: boolean; showConfirm: boolean; }[] = [];
  subscriptions: { sub_id: number; cust_id: number; start_date: Date; end_date: Date; price: Number; sub_type: Number; editable: boolean; showConfirm: boolean; }[] = [];
  fetchCustomerDetails() {
    this.http.get<any[]>('http://localhost:8765/customer/getCustomers')
      .subscribe(response => {
        this.customers = response;
 
      });
  }
   fetchPublicationsDetails() {
     this.http.get<any[]>('http://localhost:8765/publications/getPublications')
      .subscribe(response => {
        this.publications = response;
 
      });
   }
  fetchSubscriptionsDetails() {
    this.http.get<any[]>('http://localhost:8765/subscription/getSubscriptions')
      .subscribe(response => {
        this.subscriptions = response;

      });
  }
  toggleEdit(customer: any) {
    customer.editable = true; // Enable edit mode
  }

  confirmUpdate(customer: any) {
    customer.editable = false; // Disable edit mode
    // Implement the update logic here
  }

  cancelUpdate(customer: any) {
    customer.editable = false; // Disable edit mode and revert changes
  }

  toggleDelete(customer: any) {
    customer.showConfirm = true; // Show Confirm Delete and Cancel buttons
  }
  cancelDelete(customer: any) {
    customer.showConfirm = false; // Hide Confirm Delete and Cancel buttons
  }

  // Define functions for update and delete actions (not implemented here)
  updateCustomer(customer: any) {
    // Implement the update logic here
  }

  deleteCustomer(customer: any) {
    // Implement the delete logic here
    // After successful deletion, you can remove the customer from the array
    const index = this.customers.indexOf(customer);
    if (index !== -1) {
      this.customers.splice(index, 1);
    }
  }

  newCustomer= {
    id_no:0,
    name:'' ,
    address: ''
  } 

  addCustomer() {
    // Perform validation if needed
    if (this.newCustomer.id_no && this.newCustomer.name && this.newCustomer.address) {
      const newCustomer = {
        id_no: this.newCustomer.id_no, // Generate a unique ID based on the length of the array
        name: this.newCustomer.name,
        address: this.newCustomer.address,
        editable: false,
        showConfirm: false,
      };

      // Add the new customer to your data source (e.g., customers array)
      this.customers.push(newCustomer);

      this.http.post<any>('http://localhost:8765/customer/addCustomer', this.newCustomer)
        .subscribe(
          response => {

            


          },
          error => {
            console.error('Error in adding Customer:', error);
          }
          )

      // Clear the form and close the pop-up
      this.newCustomer = {
        id_no: 0,
        name: '',
        address: '',
      };
      this.showAddCustomerPopup = false;
    }
  }

    //publications method

 togglePublicationEdit(publication: any) {
    publication.editable = true; // Enable edit mode
  }

   confirmPublicationUpdate(publication: any) {
    publication.editable = false; // Disable edit mode
    // Implement the update logic here
  }

  cancelPublicationUpdate(publication: any) {
    publication.editable = false; // Disable edit mode and revert changes
  }

  togglePublicationDelete(publication: any) {
    publication.showConfirm = true; // Show Confirm Delete and Cancel buttons
  }
  cancelPublicationDelete(publication: any) {
    publication.showConfirm = false; // Hide Confirm Delete and Cancel buttons
  }

  // Define functions for update and delete actions (not implemented here)
  updatePublication(publication: any) {
    // Implement the update logic here
  }

  deletePublication(publication: any) {
    // Implement the delete logic here
    // After successful deletion, you can remove the customer from the array
    const index = this.publications.indexOf(publication);
    if (index !== -1) {
      this.publications.splice(index, 1);
    }
  }

  newPublication = {
    name: '',
    pub_type: ''
  };

  addPublication() {
    // Perform validation if needed
    if (this.newPublication.name && this.newPublication.pub_type) {
      const newPublication = {

        name: this.newPublication.name,
        pub_type: this.newPublication.pub_type,
        editable: false,
        showConfirm: false,
      };

      // Add the new customer to your data source (e.g., customers array)
      this.publications.push(newPublication);

      this.http.post<any>('http://localhost:8200/publications/addPublication', this.newPublication)
        .subscribe(
          response => {




          },
          error => {
            console.error('Error in adding Customer:', error);
          }
        )

      // Clear the form and close the pop-up
      this.newPublication = {
        name: '',
        pub_type: ''
      };
      this.showAddPublicationPopup = false;
    }
  }


  //subscription method

  toggleSubscriptionEdit(subscription: any) {
    subscription.editable = true; // Enable edit mode
  }

  confirmSubscriptionUpdate(subscription: any) {
    subscription.editable = false; // Disable edit mode
    // Implement the update logic here
  }

  cancelSubscriptionUpdate(subscription: any) {
    subscription.editable = false; // Disable edit mode and revert changes
  }

  toggleSubscriptionDelete(subscription: any) {
    subscription.showConfirm = true; // Show Confirm Delete and Cancel buttons
  }
  cancelSubscriptionDelete(subscription: any) {
    subscription.showConfirm = false; // Hide Confirm Delete and Cancel buttons
  }

  // Define functions for update and delete actions (not implemented here)
  updateSubscription(subscription: any) {
    // Implement the update logic here
  }

  deleteSubscription(subscription: any) {
    // Implement the delete logic here
    // After successful deletion, you can remove the customer from the array
    const index = this.subscriptions.indexOf(subscription);
    if (index !== -1) {
      this.subscriptions.splice(index, 1);
    }
  }
  
}



