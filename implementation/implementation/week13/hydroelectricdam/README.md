# The HydroElectric Dam
- Managing a HydroElectricDam which extends an abstract PowerGenerator.
- The dam generates electricity based on water flow, but it must carefully manage the reservoir level.

## The Rules
1. **Generation:** Power generated = waterFlow * efficiency
2. **Water Physics:** Releasing water to generate power lowers the reservoir level.
3. **Safety:** If the reservoir drops below _MIN_LEVEL (10%)_, the turbines will be damaged. 
If it goes above _MAX_LEVEL (100%)_, the dam overflows.
4. **Wear:** High water flow increases turbine wear significantly.