module Listing1_11 {
    interface House {
        bedrooms: number;
        bathrooms: number;
    }
    interface Mansion {
        bedrooms: number;
        bathrooms: number;
        butlers: number;
    }

    var avenueRoad: Mansion = {
        bedrooms: 11,
        bathrooms: 10,
        butlers: 1
    };

    // Errors: Cannot convert House to Mansion
    var mansion1: House =<House> avenueRoad;

    // Works
    var mansion: Mansion = <Mansion>avenueRoad;

} 













